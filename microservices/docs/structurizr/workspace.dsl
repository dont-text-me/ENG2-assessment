workspace "Video-Platform" "A set of microservices implementing a video hosting platform with various metrics" {

    model {
        user = person "User"
        admin = person "Admin"
        softwareSystem = softwareSystem "Video platform" {
            cli = container "Command line client"
            vm = container "Video microservice" {
                vm-domain = component "Domain entities"
                vm-controllers = component "Controllers"
                vm-dto = component "DTOs"
                vm-events = component "Kafka producers"
                vm-repositories = component "Repositories"
            }
            sm = container "Subscription microservice" {
                sm-domain = component "Domain entities"
                sm-controllers = component "Controllers"
                sm-dto = component "DTOs"
                sm-events = component "Kafka producers and consumers"
                sm-repositories = component "Repositories"
            }
            thm = container "Trending hashtag microservice"{
                thm-domain = component "Domain entities"
                thm-controllers = component "Controllers"
                thm-dto = component "DTOs"
                thm-events = component "Kafka consumers and streams"
                thm-repositories = component "Repositories"
                thm-shared = component "Shared utility functions and convenience methods"
            }
            vm-db = container "Video microservice database" "" "" database
            sm-db = container "Subscription microservice database" "" "" database
            thm-db = container "Trending hashtag microservice database" "" "" database
            kafka = container "Kafka cluster"
            kafka-ui = container "Kafka UI" "" "" webapp
        }

        user -> cli "Uses"
        admin -> kafka-ui "Uses"
        kafka-ui -> kafka "Manages"

        cli -> vm "Interacts with HTTP REST API and formats results"
        cli -> sm "Interacts with HTTP REST API and formats results"
        cli -> thm "Interacts with HTTP REST API and formats results"

        vm -> vm-db "Reads from and writes to"
        sm -> sm-db "Reads from and writes to"
        thm -> thm-db "Reads from and writes to"

        vm -> kafka "Produces events"
        sm -> kafka "Produces events and subscribes to other events"
        thm -> kafka "Produces events and streams other events"

        vm-events -> kafka "Produces events to topics `video-liked`, `video-disliked`, `video-viewed`, `user-registered`, `video-posted` in"
        vm-repositories -> vm-db "Fetches queries and executes updates"
        vm-controllers -> vm-domain "Executes business logic on"
        vm-controllers -> vm-events "Produces events from interactions with API endpoints"

        sm-events -> kafka "Reads from topics `video-viewed`, `user-registered`, `video-posted` in"
        sm-repositories -> sm-db "Fetches queries and executes updates"
        sm-controllers -> sm-domain "Executes business logic on"
        sm-controllers -> sm-events "Produces events from interactions with API endpoints"
        sm-events -> sm-repositories "Converts incoming events into database records"

        thm-events -> kafka "Streams topic `video-liked` and subscribes to topic `trending-hashtags` in"
        thm-repositories -> thm-db "Fetches queries and executes updates"
        thm-controllers -> thm-domain "Executes business logic on"
        thm-events -> thm-repositories "Converts incoming events into database records"

    }


    views {
        theme default
        systemContext softwareSystem {
            include *
        }

        container softwareSystem {
            include *
        }

        component sm {
            include *
        }

        component vm {
            include *
        }

        component thm {
            include *
        }

        styles {
            element "webapp" {
                shape WebBrowser
            }
            element "database" {
                shape Cylinder
            }
        }
    }

}