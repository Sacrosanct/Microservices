/**
 * 
 */
package com.example.domain;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * @author Bilgin
 *
 */
@XmlRootElement
@Entity
public class Team {
	
	@Id @GeneratedValue
	private long id;
	private String name,location,mascotte;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="teamId")
	private Set<Player> players;
	
	public Team(){
		super();
	}
	
	public Team(long id, String name, String location, String mascotte, Set<Player> players) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.mascotte = mascotte;
		this.players = players;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getMascotte() {
		return mascotte;
	}
	public void setMascotte(String mascotte) {
		this.mascotte = mascotte;
	}
	public Set<Player> getPlayers() {
		return players;
	}
	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	
	
}
