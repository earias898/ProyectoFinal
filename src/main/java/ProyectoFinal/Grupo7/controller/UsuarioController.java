
package ProyectoFinal.Grupo7.controller;

import ProyectoFinal.Grupo7.entity.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ProyectoFinal.Grupo7.service.IUsuarioService;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {
    
    @Autowired
    private IUsuarioService userService;
    
    @GetMapping("/user")                        //visualizar tabla de usuarios
     public String index(Model model) {
        List<Usuario> listaUser = userService.getAllUsers();
        model.addAttribute("titulo", "Tabla users");
        model.addAttribute("User", listaUser);
        return "user";
    } 
        
}

