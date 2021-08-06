package business.concretes;

import Mail.Mail;
import business.abstracts.UserService;
import core.abstracts.LoginService;
import core.abstracts.MailingService;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.UserDaoManager;
import entities.concretes.User;

import java.util.Scanner;

public class UserManager implements UserService {

    private LoginService loginService;
    private MailingService mailingService;
    private UserDao userDao;
    public UserManager(LoginService loginService, MailingService mailingService, UserDao userDao){
        this.loginService = loginService;
        this.mailingService = mailingService;
        this.userDao = userDao;
    }
    @Override
    public void logIn(User user,int loginType) {
        boolean OK = false;
        switch (loginType) {
            case 1: {
                if (loginService.isAccountTrue(user.getEmail(), user.getPassword()))
                    OK = true;
                break;
            }
            case 2: {
                if (userDao.login(user)){
                    OK = true;
                }
                break;
            }
        }
        if(OK){
            userDao.login(user);
            System.out.println(user.toString() + " has login to website");
        }
        else{
            System.out.println("Please check your email/password");
        }

    }

    @Override
    public void signUp(User user) {
        if(user.getFirstname().length()<2){
            System.out.println("Please enter firstname correctly. It must be longer than 2 digits.");
            return;
        }
        if(user.getLastname().length()<2){
            System.out.println("Please enter lastname correctly. It must be longer than 2 digits.");
            return;
        }
        if(!mailingService.isEmailCorrect(user.getEmail())){
            System.out.println("Please enter email in right format. xxxxxx@xxx.com");
            return;
        }
        if(user.getPassword().length()< 6){
            System.out.println("Please enter password as long than 5 digits.");
            return;
        }
        mailingService.sendMail(user.getEmail(),"Verification","Dear "+user.toString()+", please verificate your email.");
        System.out.println("Please write \"Verificate\" to verificate your email.");
        Scanner scanner = new Scanner(System.in);
        while(!scanner.nextLine().equals("Verificate")){
            System.out.println("Verification is unsuccess.");
        }
        mailingService.setClicked();
        if(mailingService.getClickStatus()){
            userDao.addUser(user);
            System.out.println("Account created successly.");
        }
    }

}
