package security.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import security.springsecurity.entity.Task;

@RepositoryRestResource
public interface TaskRepository extends JpaRepository<Task, Long> {
}
