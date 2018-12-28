package SpringBootFirst.SpringBootFirst.Repository;

import SpringBootFirst.SpringBootFirst.Model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role,Integer> {
}
