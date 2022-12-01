
package ProyectoFinal.Grupo7.service;

import ProyectoFinal.Grupo7.entity.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ProyectoFinal.Grupo7.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService{
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    @Override
    public List<Usuario>getAllUsers() {
        return (List<Usuario>)usuarioRepository.findAll();
    }
    
    @Override
    public Usuario getUserById(long id) {
        return usuarioRepository.findById(id).orElse(null);
     }
    
    @Override
    public void saveUser(Usuario usuario) {
        usuarioRepository.save(usuario);
     }
    
    @Override
    public void deleteUser(long id_user) {
       usuarioRepository.deleteById(id_user);
    }
    @Override
    public Usuario findByNombre(String nombre) {
        return usuarioRepository.findByNombre(nombre);
    }
    
}
