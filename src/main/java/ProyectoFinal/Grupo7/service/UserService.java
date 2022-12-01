
package ProyectoFinal.Grupo7.service;

import ProyectoFinal.Grupo7.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
     
    @Autowired
    public IUsuarioService usuarioService;
    
    @Override
    public UserDetails loadUserByUsername(String nombre) throws UsernameNotFoundException {
        Usuario usuario = this.usuarioService.findByNombre(nombre);
        Userprincipal userPrincipal = new Userprincipal(usuario);
        return userPrincipal;
    }
}
