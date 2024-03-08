package com.tweteroo.api.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.tweteroo.api.Services.TweetService;

@RestController
@RequestMapping("/users")
public class TweetController {
    
    final TweetService tweetService;

    TweetController(TweetService tweetService){
        this.tweetService = tweetService;
    }

    
}
