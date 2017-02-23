/**
 * 
 */
package com.example.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.domain.Team;

/**
 * @author Bilgin
 *
 */
@RestResource(path = "teams", rel = "team")
public interface TeamRepository extends CrudRepository<Team, Long> {

	@Override
	List<Team> findAll();

	Team findById(Long id);
}
