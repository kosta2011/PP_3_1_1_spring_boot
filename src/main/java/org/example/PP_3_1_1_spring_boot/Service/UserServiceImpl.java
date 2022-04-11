package org.example.PP_3_1_1_spring_boot.Service;

import org.example.PP_3_1_1_spring_boot.dao.UserDaoEntityManagerImpl;
import org.example.PP_3_1_1_spring_boot.model.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{
    private final UserDaoEntityManagerImpl userDaoEntityManager;

    public UserServiceImpl(UserDaoEntityManagerImpl userDaoEntityManager) {
        this.userDaoEntityManager = userDaoEntityManager;
    }

    public List<User> getAllUsers() {
        return userDaoEntityManager.getAllUsers();
    }

    public User readUserById(long id) {
        return userDaoEntityManager.readUserById(id);
    }

    public void saveUser(User user) {
        userDaoEntityManager.saveUser(user);
    }

    public void removeUserById(long id) {
        userDaoEntityManager.removeUserById(id);
    }

    public void updateUser(User user) {
        userDaoEntityManager.updateUser(user);
    }
}
