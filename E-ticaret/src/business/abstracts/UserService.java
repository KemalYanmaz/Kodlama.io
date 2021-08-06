package business.abstracts;

import entities.concretes.User;

public interface UserService {
    boolean checkInfo(User user);
    void addUser(User user);
    void loginUserwithGoogle(String email,String password);
    void loginUser(String email,String password);
}
