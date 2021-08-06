package core.concretes;

import GoogleLogin.Login;
import core.abstracts.LoginService;

public class GoogleLoginAdapter implements LoginService {
    private Login login = new Login();
    @Override
    public boolean isAccountTrue(String email,String password) {
        return login.isAccountTrue(email,password);
    }
}
