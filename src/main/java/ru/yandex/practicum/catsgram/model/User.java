package ru.yandex.practicum.catsgram.model;

import lombok.*;

import java.time.Instant;

@Data
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"email"})
public class User {
    Long id;
    String username;
    String email;
    String password;
    Instant registrationDate;
}
