package security.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import security.springsecurity.entity.Task;
import security.springsecurity.repository.TaskRepository;
import security.springsecurity.repository.UserRepository;
import security.springsecurity.service.AccountService;
import security.springsecurity.users.AppRole;
import security.springsecurity.users.AppUser;

import java.util.stream.Stream;


@SpringBootApplication
public class SpringsecurityApplication implements CommandLineRunner {

    @Autowired
    TaskRepository taskRepository;
    @Autowired
    private AccountService accountService;
    @Autowired
    UserRepository userRepository;



    public static void main(String[] args) {
        SpringApplication.run(SpringsecurityApplication.class, args);
    }

    @Bean
    public BCryptPasswordEncoder getBCPE(){
        return new BCryptPasswordEncoder();
    }

    @Override
    public void run(String... args) throws Exception {

        accountService.SaveUser(new AppUser("admin","123"));
        accountService.SaveUser(new AppUser("user","123"));
        accountService.SaveRole(new AppRole("admin"));
        accountService.addRoleToUser("admin","admin");
        accountService.addRoleToUser("user","user");

        Stream.of("T1","T2","T3").forEach(t->taskRepository.save(new Task(t)));
    }

}
