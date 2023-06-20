package com.permissions.demo.util;

import com.permissions.demo.dto.AuthSystemUserDTO;
import com.permissions.demo.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(config = CommonMapperConfig.class, uses = RoleMapper.class)
public interface UserDTOMapper {

    @Mapping(target = "userId", source = "user.id")
    AuthSystemUserDTO mapToDTO(User user);

}
