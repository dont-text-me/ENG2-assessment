# CLI client for the video microservices
## This directory contains the code for the CLI client enabling interactions with the other microservices.
### The list of commands is presented below:
* `list-videos`
  * Lists all currently known videos.
  * Allows filtering by:
    * Hashtag, by setting the `--hashtag-name` parameter
    * Author's username, by setting the `--author-username` parameter
* `post-video`
  * Creates a new video and adds it to the database
  * Requires the following parameters:
    * `-a`, the username of the author (must be a valid user)
    * `-t`, the title of the video
    * `-h`, the comma-separated list of hashtags
* `interact-with-video`
  * Records an interaction with a given video
  * Requires the following parameters:
    * `-v`, the ID of the video to be interacted with
    * `-t`, the type of interaction (LIKE, DISLIKE or WATCH)
    * `-u`, the username of the user performing the interaction (must be a valid user)
* `register-user`
  * Creates a new user and adds it to the database
  * Requires the following parameters:
    * `-u`, the desired username of the new user
* `list-trending-hashtags`
  * Lists the top 10 (or less, if less are available) hashtags, ordered by the number of likes they received
* `get-recommendations`
  * For a hashtag that the user is subscribed to, lists up to 10 videos, ordered by view count, that the user has not yet watched.
  * Requires the following parameters:
    * `-u`, the username for which to get recommendations
    * `-h`, the hashtag name for which to get recommendations
* `manage-subscriptions`
  * Records a subscribe/unsubscribe action between a user and a hashtag
  * Requires the following parameters:
    * `-u`, the name of the user whose subscription is being managed
    * `-a`, the type of action (SUBSCRIBE, UNSUBSCRIBE)
    * `-h`, the hashtag name with which to perform the action

---

### Feature tests
Feature tests are tagged with `@Tag(feature-tests)`

To run all feature tests by themselves, use the `client:featureTests` task (when running from the `microservices/client` directory).

The system is started by using a Compose testcontainer by default.
It is possible, if desired, to run the tests against another instance of docker compose, 
provided it is healthy and exposes the same ports as specified in [compose-feature-tests.yml](src/test/resources/compose-feature-tests.yml).
To do that, set the `DO_NOT_START_TESTCONTAINER` environment variable to `true` prior to running tests
e.g (UNIX/git bash/WSL)
```shell
DO_NOT_START_TESTCONTAINER=true ./gradlew client:featureTests
```
Note that it is recommended to use testcontainers when running tests locally, 
as it ensures that the databases are properly reset between each test and no caching related issues are affecting the test results.

Note: unit tests run with a different configuration 
(see [application-unit-test.yml](src/test/resources/application-unit-test.yml)). 
This allows the unit tests to run parallel to the feature tests, using a separate set of ports (3000-3002 for unit tests, 8080-8082 for feature tests)