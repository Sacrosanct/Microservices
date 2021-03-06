/**
 * 
 */
package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Bilgin
 *
 */


@XmlRootElement
@Entity
public class Player {
	
	@Id @GeneratedValue
	private Long id;
	
	private Long teamId;
	
	private String name;
	
	private String surname;
	
	private String position;

	public Player() {
		super();
	}

	public Player(Long teamId, String name, String surname, String position) {
		this.teamId = teamId;
		this.name = name;
		this.surname = surname;
		this.position = position;
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTeamId() {
		return teamId;
	}

	public void setTeamId(Long teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	

}
