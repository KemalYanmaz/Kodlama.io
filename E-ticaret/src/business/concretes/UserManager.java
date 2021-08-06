package business.concretes;

import Email.Mail;
import business.abstracts.UserService;
import core.abstracts.MailService;
import core.concretes.EmailAdapter;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class UserManager implements UserService {

    MailService mailService;
    @Override
    public boolean checkInfo(User user) {
        if(user.getFirstName().length() >= 2){
            if(user.getLastName().length() >= 2){
                if(EmailAdapter.isEmailTrue(user.getEmail())){
                    if(HibernateUserDao.checkEmail(user.getEmail())){
                        return true;
                    }else{
                        System.out.println("That email is in use");
                    }
                }else{
                    System.out.println("Email is not in true format: xxxx@xx.com");
                }
            }else{
                System.out.println("lastname length have to be longer than 2");
            }
        }else{
            System.out.println("firstname length have to be longer than 2");
        }

        return false;
    }


    @Override
    public void addUser(User user) {
        if(checkInfo(user)){
            new HibernateUserDao().addUser(user);
        }
    }

    @Override
    public void loginUserwithGoogle(String email, String password) {
        User user = new HibernateUserDao().loginUser(email,password);
        if(user!=null){
            System.out.println(user.toString() + " google ile giriş yaptı.");
        }else{
            System.out.println("Giriş başarısız");
        }
    }

    @Override
    public void loginUser(String email,String password) {
        User user = new HibernateUserDao().loginUser(email,password);
        if(user!=null){
            System.out.println(user.toString() + " diğer ile giriş yaptı.");
        }else{
            System.out.println("Giriş başarısız");
        }
    }


}
