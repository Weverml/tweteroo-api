package com.tweteroo.api.Services;

import com.tweteroo.api.Repositories.TweetRepository;

public class TweetService {
    
    final TweetRepository tweetRepository;

    TweetService(TweetRepository tweetRepository){
        this.tweetRepository = tweetRepository;
    }

}
