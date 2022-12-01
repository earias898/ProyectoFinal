
package ProyectoFinal.Grupo7.controller;

import ProyectoFinal.Grupo7.entity.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ProyectoFinal.Grupo7.service.IProductoService;

@Controller
public class ProductoController {
    
    @Autowired
    private IProductoService productoService;
    
    @GetMapping("/producto")                        //visualizar tabla de usuarios
     public String index(Model model) {
        List<Producto> listaProducto = productoService.getAllProductos();
        model.addAttribute("titulo", "Tabla Productos");
        model.addAttribute("Producto", listaProducto);
        return "producto";
    } 
}
