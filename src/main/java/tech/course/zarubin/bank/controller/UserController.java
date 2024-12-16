package tech.course.zarubin.bank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import tech.course.zarubin.bank.model.UserDto;

import java.util.List;

public interface UserController {

    ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto);

    ResponseEntity<Void> deleteUser(@PathVariable int id);

    ResponseEntity<UserDto> updateUser(@PathVariable int id, @RequestParam(name = "name") String name);

    ResponseEntity<UserDto> getUserById(@PathVariable int id);

    ResponseEntity<List<UserDto>> getAllUsers();
}
