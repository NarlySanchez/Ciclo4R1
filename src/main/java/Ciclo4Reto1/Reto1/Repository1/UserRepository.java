/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclo4Reto1.Reto1.Repository1;

import Ciclo4Reto1.Reto1.Model.User;
import Ciclo4Reto1.Reto1.Repository.Interface.UserInterface;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author nbsc1
 * Reto 1 Ciclo 4
 */
@Repository
public class UserRepository {
     @Autowired
    private UserInterface userCrudRepository;
     
     public List <User> getAll(){
     return (List<User>) userCrudRepository.findAll();
     }
     
    public Optional<User> getUser(int id) {
        return userCrudRepository.findById(id);
    }
       
    public User save(User user) {
        return userCrudRepository.save(user);
    }
   
    public Optional<User> existeEmail(String email) {
        return userCrudRepository.findByEmail(email);      
    }
    
     public Optional<User> autenticarUsuario(String email, String password) {
        return userCrudRepository.findByEmailAndPassword(email, password);
    }
     
}
