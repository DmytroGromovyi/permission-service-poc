package com.permissions.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthSystemUserDTO {
    private String userId;
    private List<RoleDTO> roles;
}
