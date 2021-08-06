package Mail;

public class Mail {
    private boolean isClicked = false;
    public void sendMail(String email,String subject, String message){
        System.out.println("--Mail has sended--\nTo: "+email+"\nSubject: "+subject+"\nMessage: "+message);
    }

    public boolean getClickStatus(){
        return isClicked;
    }

    public void setClicked(){
        this.isClicked = true;
    }

    public boolean isEmailCorrect(String email){
        if(!email.isEmpty() && email.contains("@") && email.endsWith(".com") && email.charAt(email.length()-4)!='@'){
            return true;
        }
        return false;
    }

}
