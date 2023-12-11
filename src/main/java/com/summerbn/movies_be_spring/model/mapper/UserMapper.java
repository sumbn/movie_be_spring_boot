package com.summerbn.movies_be_spring.model.mapper;

import com.summerbn.movies_be_spring.entity.User;
import com.summerbn.movies_be_spring.model.dto.UserDto;

public class UserMapper {

    public static UserDto toUserDto(User user){
        UserDto tmp = new UserDto();
        tmp.setId(user.getId());
        tmp.setUserName(user.getUserName());
        return tmp;
    }

}
