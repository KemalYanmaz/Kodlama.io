import business.concretes.UserManager;
import entities.concretes.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = null;
        String firstname,lastname,email,password;
        UserManager manager =new UserManager();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Please choose the process type:\n1-Login\n2-Signup");
            switch (scanner.nextInt()) {
                case 1: {
                    System.out.println("Please choose login type:\n1-Google\n2-Other");
                    switch (scanner.nextInt()) {
                        case 1: {
                            scanner.nextLine();
                            System.out.print("Email: ");
                            email = scanner.nextLine();
                            System.out.print("Şifre");
                            password = scanner.nextLine();
                            manager.loginUserwithGoogle(email, password);
                            break;
                        }
                        case 2: {
                            scanner.nextLine();
                            System.out.print("Email: ");
                            email = scanner.nextLine();
                            System.out.print("Şifre");
                            password = scanner.nextLine();
                            manager.loginUser(email, password);
                            break;
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Please choose sign up type:\n1-Google\n2-Other");

                    int id = 0;
                    switch (scanner.nextInt()) {
                        case 1: {
                            scanner.nextLine();
                            System.out.print("Ad: ");
                            firstname = scanner.nextLine();
                            System.out.print("Soyad: ");
                            lastname = scanner.nextLine();
                            System.out.print("Email: ");
                            email = scanner.nextLine();
                            System.out.print("Şifre");
                            password = scanner.nextLine();

                            try {
                                user = new User(id, firstname, lastname, email, password);
                                manager.addUser(user);

                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }

                            break;
                        }
                        case 2: {
                            scanner.nextLine();
                            System.out.print("Ad: ");
                            firstname = scanner.nextLine();
                            System.out.print("Soyad: ");
                            lastname = scanner.nextLine();
                            System.out.print("Email: ");
                            email = scanner.nextLine();
                            System.out.print("Şifre");
                            password = scanner.nextLine();

                            try {
                                user = new User(id, firstname, lastname, email, password);
                                manager.addUser(user);

                            } catch (Exception e) {
                                System.out.println(e.getMessage());
                            }

                            break;
                        }

                    }
                    break;

                }

            }
        }
        }

    }
