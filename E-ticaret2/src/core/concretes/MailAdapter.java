package core.concretes;

import Mail.Mail;
import core.abstracts.MailingService;

public class MailAdapter implements MailingService {
    private Mail mail = new Mail();
    @Override
    public void sendMail(String email,String subject,String message) {
        mail.sendMail(email,subject,message);
    }

    @Override
    public boolean getClickStatus() {
        return mail.getClickStatus();
    }

    @Override
    public void setClicked() {
        mail.setClicked();
    }

    @Override
    public boolean isEmailCorrect(String email) {
        return mail.isEmailCorrect(email);
    }
}
