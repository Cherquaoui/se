package security.springsecurity.users;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter

public class AppRole {
    @Id
    @GeneratedValue
    private long id;
    private String role;

    public AppRole() {
    }

    public AppRole(String role) {
        this.role = role;
    }
}
