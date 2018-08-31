package security.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import security.springsecurity.users.AppUser;

public interface UserRepository extends JpaRepository<AppUser,Long> {
    /*AppUser findByUsername(String username);*/
    AppUser findAppUserByUsername(String username);
}
