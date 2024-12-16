package tech.course.zarubin.bank.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tech.course.zarubin.bank.entity.User;
import tech.course.zarubin.bank.model.UserDto;
import tech.course.zarubin.bank.repository.UserRepository;
import tech.course.zarubin.bank.service.UserService;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        userRepository.save(new User(userDto.getFullName(), userDto.getBirthDate(), userDto.getJob()));
        return userDto;
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    @Override
    public UserDto updateUser(int id, String name) {
        var user = userRepository.findById(id).orElseThrow();
        user.setFullName(name);

        return new UserDto(userRepository.save(user));
    }

    @Override
    public UserDto getUserDtoById(int id) {
        return new UserDto(userRepository.findById(id).orElseThrow());
    }

    @Override
    public List<UserDto> getAllUsers() {
        List<UserDto> res = new ArrayList<>();
        List<User> response = userRepository.findAll();
        for (User i : response) {
            res.add(new UserDto(i));
        }
        return res;
    }
}