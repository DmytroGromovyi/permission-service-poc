package com.permissions.demo.controller;

import com.permissions.demo.dto.AuthSystemUserDTO;
import com.permissions.demo.security.CustomUserDetails;
import com.permissions.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Api(tags = "user-controller")
@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    @GetMapping
    @ApiOperation(value = "Get user permissions info by user id")
    public AuthSystemUserDTO getUser(Principal principal) {
        var user = (CustomUserDetails) principal;
        return userService.getUserByName(user.getUserId());
    }

}
