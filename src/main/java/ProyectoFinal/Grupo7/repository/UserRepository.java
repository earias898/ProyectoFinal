
package ProyectoFinal.Grupo7.repository;

import ProyectoFinal.Grupo7.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    
}
