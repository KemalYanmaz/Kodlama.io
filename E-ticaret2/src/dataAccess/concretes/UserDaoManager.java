package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoManager implements UserDao {

    List<User> users = new ArrayList<>();

    @Override
    public boolean isEmailinUse(String email) {
        for(User user:users){
            if(user.getEmail().equals(email)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void addUser(User user) {
        users.add(user);
        System.out.println(user.toString() + "has added. --UserDaoManager--");
    }

    @Override
    public boolean login(User user) {
        for(User user1:users){
            if(user1.getEmail().equals(user.getEmail())&&user1.getPassword().equals(user.getPassword())){
                System.out.println(user.toString() + " has login");
                return true;
            }
        }
        System.out.println("Please check your email/password");
        return false;
    }
}
