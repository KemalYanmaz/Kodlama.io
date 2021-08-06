package dataAccess.concretes;

import core.concretes.EmailAdapter;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HibernateUserDao implements UserDao {
    final static List<User> users = new ArrayList<>();

    public static boolean checkEmail(String email){
        for(User user: users){
            if(user.getEmail().equals(email)){
                return false;
            }
        }
        return true;
    }

    @Override
    public void addUser(User user) {
        new EmailAdapter(user.getEmail(),"Kayıt","Lütfen email adresinizi doğrulayın.").sendMail();
        System.out.println("Lütfen mailinizi kontrol ediniz.(\"Doğruladım\" yazınız.)");
        Scanner scanner = new Scanner(System.in);
        if(scanner.nextLine().equals("Doğruladım")){
            users.add(user);
            System.out.println(user.toString() + " eklendi.");
        }
    }

    @Override
    public User loginUser(String email, String password) {
        for(User user:users){
            if(user.getEmail().equals(email)&&user.getPassword().equals(password)) {
                System.out.println(user.toString() + " giriş yaptı.");
                return user;
            }
        }
        System.out.println("Email veya şifre yanlış");
        return null;
    }
}
