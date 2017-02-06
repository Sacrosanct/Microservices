/**
 * 
 */
package com.example.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Team;

/**
 * @author Bilgin
 *
 */
public interface TeamRepository extends CrudRepository<Team, Long> {

}
