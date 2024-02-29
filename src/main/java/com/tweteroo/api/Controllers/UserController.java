package com.tweteroo.api.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.api.Repositories.UserRepository;

@RestController
@RequestMapping("/tweets")
public class UserController {
    
    final UserRepository userRepository;

    UserController(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    
}
