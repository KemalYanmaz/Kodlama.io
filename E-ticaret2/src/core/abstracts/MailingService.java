package core.abstracts;

public interface MailingService {
    void sendMail(String email,String subject,String message);
    boolean getClickStatus();
    void setClicked();
    boolean isEmailCorrect(String email);
}
