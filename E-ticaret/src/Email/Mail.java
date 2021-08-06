package Email;

public class Mail {
    private String email;
    private String subject;
    private String message;

    public Mail(String email,String subject,String message){
        this.email = email;
        this.subject = subject;
        this.message = message;
    }

    public void sendMail(){
        System.out.println("*****The message has sended*****\nTo: "+email+"\nSubject: "+subject+"\nMessage: "+message);
    }

    public static boolean isEmailTrue(String email){
        if(email.contains("@") && email.endsWith(".com") && !(email.charAt(email.length()-4)=='@'))
            return true;
        return false;
    }
}
