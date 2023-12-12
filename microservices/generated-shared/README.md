# Shared code (generated)

---
## This code contains parts of the generated java code that are shared across the microservices.

The code will be written to the `build/generated/egx` directory and will include the following:
* DTOs used by each microservice
* HTTP client interfaces (with `@Client` annotations, default URLs and config values, etc.)
* Interfaces, without annotations, that specify the desired return types and parameter values of HTTP controllers. 
The client interfaces inherit from these interfaces to ensure consistency across clients and controllers.
* Static strings for each kafka topic, to ensure consistent topic names across the manually implemented streams and kafka consumers.