# Video microservices

## This root project contains the following directories:
* video-microservice
  * Stores information about users, videos and hashtags
  * Records users' interactions with videos e.g. likes, views, dislikes, posts
  * Sends messages to their corresponding kafka topics
* trending-hashtag-microservice
  * Subscribes to events from the video microservice and reports the top 10 most liked hashtags within the last hour
* client
  * Contains CLI commands that enable interaction with other microservices


## Running the services locally

### Step 1
Build docker images
```shell
./gradlew dockerBuild
```
### Step 2
Start the kafka cluster, microservices and databases
```shell
docker compose up
```
### Step 3
Use CLI to interact with the apps. From the `client` directory:
```shell
./gradlew run --args="your commmand"
```
For the full list of commands, please consult [the client's README](client/README.md)
