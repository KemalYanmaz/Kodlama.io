package core.concretes;

import Email.Mail;
import core.abstracts.MailService;

public class EmailAdapter implements MailService {
    Mail mail;

    public EmailAdapter(String email,String subject,String message ) {
        mail = new Mail(email,subject,message);
    }

    @Override
    public void sendMail() {
        mail.sendMail();
    }

    public static boolean isEmailTrue(String email) {
        return Mail.isEmailTrue(email);
    }

}
