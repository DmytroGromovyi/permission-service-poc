package com.permissions.demo.controller;

import com.permissions.demo.dto.AuthSystemUserDTO;
import com.permissions.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "user-controller")
@RestController
@AllArgsConstructor
@RequestMapping("/user/")
public class UserController {

    private final UserService userService;

    @GetMapping("/{userId}")
    @ApiOperation(value = "Get user permissions info by user id")
    public AuthSystemUserDTO get(@PathVariable Long userId) {
        return userService.getUserById(userId);
    }

}
