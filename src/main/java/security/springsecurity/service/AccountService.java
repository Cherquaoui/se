package security.springsecurity.service;

import org.springframework.stereotype.Service;
import security.springsecurity.users.AppRole;
import security.springsecurity.users.AppUser;

@Service
public interface AccountService {
    AppUser SaveUser(AppUser user);
    AppRole SaveRole(AppRole role);
    void addRoleToUser(String user,String role);
    public AppUser findUserByUserName(String name);
}
