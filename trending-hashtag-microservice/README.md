# Trending hashtag microservice

---

The central feature of this microservice is 
a kafka stream that subscribes to the `video-liked` topic.

This stream tracks like counts for each hashtag over a 1-hour 
(duration can be configured by setting the `trending-hashtags.window-size` property ) 
sliding window and returns the top 10 liked hashtags 
(leaderboard size can be configured by setting the `trending-hashtags.leaderboard-size` property)
