# Subscriptions microservice

---

This microservice subscribes to the events published by the video microservice
and recreates the links between videos, users (views only) and hashtags from the received events.
The service also allows users to subscribe and unsubscribe from hashtags, 
providing recommended videos to watch for a given user and hashtag based on views.