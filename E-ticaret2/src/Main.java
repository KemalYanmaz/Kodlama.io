import business.concretes.UserManager;
import core.concretes.GoogleLoginAdapter;
import core.concretes.MailAdapter;
import dataAccess.concretes.UserDaoManager;
import entities.concretes.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        UserManager userManager = new UserManager(new GoogleLoginAdapter(),new MailAdapter(),new UserDaoManager());
        int logintype;

        while(true) {
            System.out.println("Please select the process:\n1-Login\n2-Signup");

            switch (scanner.nextInt()) {
                case 1: {
                    scanner.nextLine();
                    System.out.print("Please select the Login type:\n1-Google\n2-Other");
                    logintype = scanner.nextInt();
                    userManager.logIn(getInfo(scanner, 1), logintype);
                    break;
                }
                case 2: {
                    userManager.signUp(getInfo(scanner, 2));
                    break;
                }
            }
        }
    }
    static User getInfo(Scanner scanner,int type){
        String firstname = null,lastname=null,email=null ,password=null;
        scanner.nextLine();
        switch (type){
            case 1:{
                System.out.print("Email: ");
                email = scanner.nextLine();
                System.out.print("Password: ");
                password = scanner.nextLine();
                return new User(firstname,lastname,email,password);
            }
            case 2:{
                System.out.print("Firstname: ");
                firstname = scanner.nextLine();
                System.out.print("Lastname: ");
                lastname = scanner.nextLine();
                System.out.print("Email: ");
                email = scanner.nextLine();
                System.out.print("Password: ");
                password = scanner.nextLine();
                return new User(firstname,lastname,email,password);
            }
        }
        return new User();
    }

}
