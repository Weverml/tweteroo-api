package com.tweteroo.api.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.Repositories.TweetRepository;

@RestController
@RequestMapping("/users")
public class TweetController {
    
    final TweetRepository tweetRepository;

    TweetController(TweetRepository tweetRepository){
        this.tweetRepository = tweetRepository;
    }

    
}
