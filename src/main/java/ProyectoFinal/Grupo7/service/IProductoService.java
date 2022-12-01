
package ProyectoFinal.Grupo7.service;

import ProyectoFinal.Grupo7.entity.Producto;
import java.util.List;

public interface IProductoService {
    public List<Producto> getAllProductos();
    public Producto getProductoById(long codigo);       //probar con id
    public void saveProducto(Producto producto);
    public void deleteProducto(long codigo);            //probar con id por si acaso
}
