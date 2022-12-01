
package ProyectoFinal.Grupo7.repository;

import ProyectoFinal.Grupo7.entity.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long>{
    
}
