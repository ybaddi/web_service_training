package org.example.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	private String firstname;
	private String lastname;
	
	@Column(unique=true, nullable=false)
	private String email;
	@Column(unique=true, nullable=false)
	private String username;
	@Column(nullable=false)
	private String password;
	@Column(name="active")
	private boolean active;
	
	
//	TODO add roles or authority
}
