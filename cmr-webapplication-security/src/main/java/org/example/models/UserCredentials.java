package org.example.models;

import java.util.UUID;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@XmlRootElement
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class UserCredentials {

//	private UUID id;
	private String username;
	private String password;
}
