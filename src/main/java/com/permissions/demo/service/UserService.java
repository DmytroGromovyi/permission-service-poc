package com.permissions.demo.service;

import com.permissions.demo.dto.AuthSystemUserDTO;
import com.permissions.demo.exception.UserNotFoundException;
import com.permissions.demo.model.User;
import com.permissions.demo.repository.UserRepository;
import com.permissions.demo.util.UserDTOMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserDTOMapper userDTOMapper;

    public AuthSystemUserDTO getUserByName(String userId) {
        User user = userRepository.findByName(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));
        return userDTOMapper.mapToDTO(user);
    }

}
