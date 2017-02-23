/**
 * 
 */
package com.example.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.domain.Player;

/**
 * @author bilgin.ertas
 * 22 Şub 2017
 *
 * _ __     _           
 * ( /  )o  //    o      
 *  /--<,  // _, ,  _ _  
 * /___/(_(/_(_)_(_/ / /_
 *            /|         
 *           (/         
 *  
 */
@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Player, Long> {

}
