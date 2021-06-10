package com.choirula.oauth2authorization.controller;

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@EnableResourceServer
public class Oauth2Controller {

    //This method will be used to check if the user has a valid token to access the resource
    @RequestMapping("/validateUser")
    public Principal user(Principal user) {
        return user;
    }

}
