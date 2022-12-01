
package ProyectoFinal.Grupo7.repository;

import ProyectoFinal.Grupo7.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long>{
    Usuario findByNombre (String nombre);
}
