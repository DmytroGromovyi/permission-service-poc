package com.permissions.demo.util;

import com.permissions.demo.dto.AuthSystemUserDTO;
import com.permissions.demo.dto.RoleDTO;
import com.permissions.demo.model.Permission;
import com.permissions.demo.model.Role;
import com.permissions.demo.model.User;

import java.util.List;


public class UserDTOMapper {

    public static AuthSystemUserDTO mapToDTO(User user) {
        AuthSystemUserDTO response = new AuthSystemUserDTO();
        response.setUserId(user.getId());
        List<RoleDTO> roles = user.getRoles().stream().map(UserDTOMapper::mapToDTO).toList();
        response.setRoles(roles);
        return response;
    }

    public static RoleDTO mapToDTO(Role role) {
        RoleDTO response = new RoleDTO();
        response.setName(role.getName());
        List<String> permissions = role.getPermissions().stream().map(Permission::getName).toList();
        response.setPermissions(permissions);
        return response;
    }
}
