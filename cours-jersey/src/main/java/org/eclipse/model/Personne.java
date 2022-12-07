package org.eclipse.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@XmlRootElement
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Personne {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String secondname;
	private int age;
	
	
	@ManyToMany(fetch = FetchType.LAZY , cascade = { CascadeType.ALL })
	@JoinTable( name ="personne_adresse",
	joinColumns=@JoinColumn(name="personne_id"),
	inverseJoinColumns=@JoinColumn(name="adresse_id"))
	private List<Adresse> adresses=new ArrayList<Adresse>();
	
	
	
	
	
	
	
	
	
	
	
}
