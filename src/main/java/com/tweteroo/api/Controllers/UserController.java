package com.tweteroo.api.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.tweteroo.api.Services.UserService;

@RestController
@RequestMapping("/tweets")
public class UserController {

    final UserService userService;

    UserController(UserService userService){
        this.userService = userService;
    }

}
