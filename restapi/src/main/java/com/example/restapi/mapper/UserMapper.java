package com.example.restapi.mapper;

import com.example.restapi.dto.UserDto;
import com.example.restapi.model.Car;
import com.example.restapi.model.User;

import java.util.stream.Collectors;

public class UserMapper {

    static public UserDto bigUserToSmallUserDto(User user, UserDto userDto) {
        userDto.setUserName(user.getUserName());
        userDto.setSurName(user.getSurName());
        userDto.setBankName(user.getCard().getBankName());
        userDto.setCarBrand(user.getCarList().stream()
                .map(Car::getCarBrand)
                .collect(Collectors.toList()));
        return userDto;
    }
}
