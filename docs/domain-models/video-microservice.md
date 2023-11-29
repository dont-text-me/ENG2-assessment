```mermaid
classDiagram
    direction BT
    class hashtag {
        String id
    }
    class user {
        String username
        Long id
    }
    class user_video {
        Long viewers_id
        Long viewed_videos_id
    }
    class user_video_dislikes {
        Long dislikers_id
        Long disliked_videos_id
    }
    class user_video_likes {
        Long likers_id
        Long liked_videos_id
    }
    class video {
        Long dislike_count
        Long like_count
        datetime(6) published_at
        String title
        Long view_count
        Long author_id
        Long id
    }
    class video_hashtag {
        Long tagged_videos_id
        String hashtags_id
    }

    user_video  -->  user
    user_video  -->  video
    user_video_dislikes  -->  user
    user_video_dislikes  -->  video
    user_video_likes  -->  user
    user_video_likes  -->  video
    video  -->  user
    video_hashtag  -->  hashtag
    video_hashtag  -->  video
```
[Main README](../../README.md)