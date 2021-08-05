public class UserManager {
    public void addUser(User user){
        System.out.println(user.getName() + " has added.");
    }

    public void deleteUser(User user){
        System.out.println(user.getName() + " has deleted.");
    }

    public void login(User user){
        System.out.println(user.getName() + "logged in.");
    }

    public void exit(User user){
        System.out.println(user.getName() + "exited");
    }


}
