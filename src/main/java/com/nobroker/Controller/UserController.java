package com.nobroker.Controller;

import com.nobroker.entity.User;
import com.nobroker.payload.UserDto;
import com.nobroker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping
    public ResponseEntity<String> creteUser(@RequestBody  UserDto userDto){
        long userId = userService.createUser(userDto);
          return new ResponseEntity<>("user is created:"+userId, HttpStatus.CREATED);

    }

}
