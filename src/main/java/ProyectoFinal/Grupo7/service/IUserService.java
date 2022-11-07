
package ProyectoFinal.Grupo7.service;

import ProyectoFinal.Grupo7.entity.User;
import java.util.List;

public interface IUserService {
    public List<User> getAllUsers();
    public User getUserById(long id_user);
    public void saveUser(User user);
    public void deleteUser(long id_user);
}
