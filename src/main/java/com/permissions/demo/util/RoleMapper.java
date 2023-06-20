/*
 * Canadian Tire Corporation, Ltd. Do not reproduce without permission in writing.
 * Copyright (c) 2022. Canadian Tire Corporation, Ltd. All rights reserved.
 */

package com.permissions.demo.util;


import com.permissions.demo.dto.RoleDTO;
import com.permissions.demo.model.Permission;
import com.permissions.demo.model.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;
import java.util.stream.Collectors;

@Mapper(config = CommonMapperConfig.class)
public abstract class RoleMapper {
    @Mapping(target = "permissions", source = "permissions", qualifiedByName = "mapPermissions")
    public abstract RoleDTO mapToDTO(Role role);

    @Named("mapPermissions")
    public static List<String> mapPermissions(List<Permission> permissions) {
        return permissions.stream().map(Permission::getName).toList();
    }
}
