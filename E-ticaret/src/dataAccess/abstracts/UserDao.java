package dataAccess.abstracts;

import entities.concretes.User;

public interface UserDao {
    void addUser(User user);
    User loginUser(String email, String password);
}
