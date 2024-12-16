package tech.course.zarubin.bank.controller.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.course.zarubin.bank.controller.UserController;
import tech.course.zarubin.bank.model.UserDto;
import tech.course.zarubin.bank.service.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserControllerImpl implements UserController {

    private final UserService userService;

    @Override
    @PostMapping
    public ResponseEntity<UserDto> createUser(UserDto userDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(userDto));
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(int id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    @PatchMapping("/{id}")
    public ResponseEntity<UserDto> updateUser(int id, String name) {
        return ResponseEntity.ok(userService.updateUser(id, name));
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUserById(int id) {
        return ResponseEntity.ok(userService.getUserDtoById(id));
    }

    @Override
    @GetMapping
    public ResponseEntity<List<UserDto>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }
}
