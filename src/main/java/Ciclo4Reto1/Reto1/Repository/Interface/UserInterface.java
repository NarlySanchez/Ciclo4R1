/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciclo4Reto1.Reto1.Repository.Interface;

import Ciclo4Reto1.Reto1.Model.User;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;


/**
 *
 * @author nbsc1
 * Reto 1 Ciclo 4
 */
public interface UserInterface extends CrudRepository <User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    
}
