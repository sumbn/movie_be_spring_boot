package com.summerbn.movies_be_spring.service;

import com.summerbn.movies_be_spring.entity.User;
import com.summerbn.movies_be_spring.model.dto.UserDto;
import com.summerbn.movies_be_spring.model.mapper.UserMapper;
import com.summerbn.movies_be_spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDto> getListUser() {
        List<User> list = userRepository.findAll();
        List<UserDto> result = new ArrayList<>();
        for (User user: list){
            result.add(UserMapper.toUserDto(user));
        }
        return result;
    }

    @Override
    public UserDto getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return UserMapper.toUserDto(user.orElse(null));
    }
}
