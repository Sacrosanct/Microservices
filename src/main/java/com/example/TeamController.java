/**
 * 
 */
package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.TeamRepository;
import com.example.domain.Team;

/**
 * @author Bilgin
 *
 */
@RestController
public class TeamController {
	
	@Autowired
	private TeamRepository teamRepository;

	@RequestMapping("/teams")
	public List<Team> getTeams(){
		return (List<Team>) teamRepository.findAll();
	}
	
	@RequestMapping("/teams/{id}")
	public Team getTeamById(@PathVariable Long id){
		return teamRepository.findOne(id);
	}
}
