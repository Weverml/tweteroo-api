package com.tweteroo.api.Services;

import com.tweteroo.api.Repositories.UserRepository;

public class UserService {
    
    final UserRepository userRepository;

    UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
}
