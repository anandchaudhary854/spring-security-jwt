package com.demo.jwt.api;

import com.demo.jwt.api.entity.User;
import com.demo.jwt.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringSecurityJwtApplication {
    @Autowired
    private UserRepository repository;

    @PostConstruct
    public void initUsers() {
        List<User> users = Stream.of(
                new User(1, "anand", "anand", "anand@gmail.com"),
                new User(2, "user", "user", "user@gmail.com"),
                new User(3, "user1", "user1", "user1@gmail.com")
        ).collect(Collectors.toList());
        repository.saveAll(users);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityJwtApplication.class, args);
    }

}
