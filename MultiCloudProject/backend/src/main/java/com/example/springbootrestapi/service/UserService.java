//package com.example.springbootrestapi.service;
//
//import com.example.springbootrestapi.entity.User;
//import com.example.springbootrestapi.repository.UserRepository;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class UserService {
//
//    private final UserRepository userRepository;
//    private final PasswordEncoder passwordEncoder;
//
//    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
//        this.userRepository = userRepository;
//        this.passwordEncoder = passwordEncoder;
//        initializeAdminUser(); // Replace @PostConstruct logic here
//    }
//
//    public Optional<User> findByUsername(String username) {
//        return userRepository.findByUsername(username);
//    }
//
//    public User saveUser(User user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword())); // Encrypt the password
//        return userRepository.save(user);
//    }
//
//    private void initializeAdminUser() {
//        if (userRepository.findByUsername("admin").isEmpty()) {
//            User admin = new User();
//            admin.setUsername("admin");
//            admin.setPassword(passwordEncoder.encode("adminpass")); // Default password
//            admin.setRole("ROLE_ADMIN");
//            userRepository.save(admin);
//        }
//    }
//}

package com.example.springbootrestapi.service;

import com.example.springbootrestapi.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final List<User> userList = new ArrayList<>();

    public Optional<User> findByUsername(String username) {
        return userList.stream().filter(user -> user.getUsername().equals(username)).findFirst();
    }

    public User saveUser(User user) {
        userList.add(user);
        return user;
    }
}
