/**
 * 
 */
package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.dao.TeamRepository;
import com.example.domain.Team;

/**
 * @author Bilgin
 *
 */
@Controller
public class TeamController {

	@Autowired
	private TeamRepository teamRepository;

	@RequestMapping("/rc/teams")
	public List<Team> getTeams() {
		return teamRepository.findAll();
	}

	@RequestMapping("/rc/teams/{id}")
	public Team getTeamById(@PathVariable Long id) {
		return teamRepository.findById(id);
	}
}
