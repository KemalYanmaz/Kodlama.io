package business.abstracts;

import entities.concretes.User;

public interface UserService {
    void logIn(User user,int logintype);
    void signUp(User user);
}
