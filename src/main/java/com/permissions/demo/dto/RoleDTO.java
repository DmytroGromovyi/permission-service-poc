package com.permissions.demo.dto;

import lombok.Data;

import java.util.List;

@Data
public class RoleDTO {
    private String name;
    private List<String> permissions;
}
