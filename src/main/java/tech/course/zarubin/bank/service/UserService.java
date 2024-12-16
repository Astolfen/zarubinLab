package tech.course.zarubin.bank.service;

import tech.course.zarubin.bank.model.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto userDto);

    void deleteUser(int id);

    UserDto updateUser(int id, String name);

    UserDto getUserDtoById(int id);

    List<UserDto> getAllUsers();
}