package dataAccess.abstracts;

import entities.concretes.User;

public interface UserDao {
    boolean isEmailinUse(String email);
    void addUser(User user);
    boolean login(User user);

}
