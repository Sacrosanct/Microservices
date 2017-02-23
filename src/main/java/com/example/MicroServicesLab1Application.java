package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.example.dao.TeamRepository;
import com.example.domain.Player;
import com.example.domain.Team;

@SpringBootApplication
public class MicroServicesLab1Application extends SpringBootServletInitializer {

	@Autowired
	private TeamRepository teamRepository;

	@PostConstruct
	public void init() {
		List<Team> teams = new ArrayList<>();
		
		Set<Player> players = new HashSet<Player>(); 
		
		Team team = new Team();
		team.setName("Galatasaray");
		team.setLocation("Istanbul");
		team.setMascotte("Lion");		
		
		team.setPlayers(players);
		players.add(new Player(new Long(1), "Bilgin", "Ertas", "Forward"));
		players.add(new Player(new Long(1), "Hasan", "Şaş", "Forward"));
		players.add(new Player(new Long(1), "George", "Hagi", "Middle"));
		players.add(new Player(new Long(1), "Bülent", "Korkmaz", "Defence"));
		
		teams.add(team);

		team = new Team();
		team.setName("FC Barcelona");
		team.setLocation("Barcelona");
		team.setMascotte("Cup");
		teams.add(team);

		team = new Team();
		team.setName("Besiktas");
		team.setLocation("Istanbul");
		team.setMascotte("Eagle");
		teams.add(team);
		
		teamRepository.save(teams);
	}

	/**
	 * 
	 * Used When run as jar
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(MicroServicesLab1Application.class, args);
	}

	/**
	 * 
	 * Used When run as war
	 * 
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.boot.web.support.SpringBootServletInitializer#configure(org.springframework.boot.builder.SpringApplicationBuilder)
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(MicroServicesLab1Application.class);
	}
}
