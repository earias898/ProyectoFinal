
package ProyectoFinal.Grupo7.service;

import ProyectoFinal.Grupo7.entity.Usuario;
import java.util.List;

public interface IUsuarioService {
    public List<Usuario> getAllUsers();
    public Usuario getUserById(long id);
    public void saveUser(Usuario usuario);
    public void deleteUser(long id);
    public Usuario findByNombre(String nombre);
}
