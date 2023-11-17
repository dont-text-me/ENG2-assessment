# CLI client for the video microservices
## This directory contains the code for the CLI client enabling interactions with the other microservices.
### Currently implemented commands are:
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
    * `h`, the comma-separated list of hashtags
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


### Feature tests
Feature tests are tagged with `@Tag(feature-tests)`

To run all feature tests by themselves, use the `client:featureTests` task.

Note: feature test classes are also annotated with `@Order`. 
This is only needed due to the fact that Wiremock (used for unit tests) 
cannot run with docker-compose running in the background as the exposed ports conflict. The order of tests does not matter otherwise.