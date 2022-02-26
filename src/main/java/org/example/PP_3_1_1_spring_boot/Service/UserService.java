package org.example.PP_3_1_1_spring_boot.Service;

import org.example.PP_3_1_1_spring_boot.model.User;
import org.example.PP_3_1_1_spring_boot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserService{
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User readUserById(long id) {
        return userRepository.getById(id);
    }

    public void saveUser(String name, String lastName) {
        userRepository.save(new User(name, lastName));
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public void removeUserById(long id) {
        userRepository.deleteById(id);
    }

    public void updateUser(User user) {
        userRepository.updateUserById(user.getId(), user.getName(), user.getLastName());
    }
}
