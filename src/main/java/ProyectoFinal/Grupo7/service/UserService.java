
package ProyectoFinal.Grupo7.service;

import ProyectoFinal.Grupo7.entity.User;
import ProyectoFinal.Grupo7.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    
    @Autowired
    private UserRepository userRepository;
    
    @Override
    public List<User>getAllUsers() {
        return (List<User>)userRepository.findAll();
    }
    
    @Override
    public User getUserById(long id_user) {
        return userRepository.findById(id_user).orElse(null);
     }
    
    @Override
    public void saveUser(User user) {
        userRepository.save(user);
     }
    
    @Override
    public void deleteUser(long id_user) {
       userRepository.deleteById(id_user);
    }
    
}
