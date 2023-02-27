package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(long id);

    void createUser(User user);

    void updateUser(User user);

    User deleteUser(long parseUnsignedInt);
}
