package core.abstracts;

import dataAccess.abstracts.UserDao;

public interface LoginService {
    public boolean isAccountTrue(String email,String password);
}
