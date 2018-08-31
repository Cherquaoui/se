package security.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import security.springsecurity.users.AppRole;

public interface RoleRepository extends JpaRepository<AppRole, Long> {
    AppRole findAppRoleByRole(String role);
}
