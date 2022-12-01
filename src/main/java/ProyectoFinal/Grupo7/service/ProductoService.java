
package ProyectoFinal.Grupo7.service;

import ProyectoFinal.Grupo7.entity.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ProyectoFinal.Grupo7.repository.ProductoRepository;

@Service
public class ProductoService implements IProductoService{
    
    @Autowired
    private ProductoRepository usuarioRepository;
    
    @Override
    public List<Producto>getAllProductos() {
        return (List<Producto>)usuarioRepository.findAll();
    }
    
    @Override
    public Producto getProductoById(long id) {
        return usuarioRepository.findById(id).orElse(null);
     }
    
    @Override
    public void saveProducto(Producto Producto) {
        usuarioRepository.save(Producto);
     }
    
    @Override
    public void deleteProducto(long codigo) {
       usuarioRepository.deleteById(codigo);
    }
}
