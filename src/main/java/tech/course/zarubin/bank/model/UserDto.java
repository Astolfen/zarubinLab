package tech.course.zarubin.bank.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tech.course.zarubin.bank.entity.User;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String fullName;
    private LocalDate birthDate;
    private String job;

    public UserDto(User user) {
        this.fullName = user.getFullName();
        this.birthDate = user.getBirthDate();
        this.job = user.getJob();
    }
}