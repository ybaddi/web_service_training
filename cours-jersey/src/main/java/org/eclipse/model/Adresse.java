package org.eclipse.model;

import java.util.ArrayList;
import java.util.List;

import javax.json.bind.annotation.JsonbTransient;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@XmlRootElement
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Adresse {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String rue;
	private String ville;
	private String codePostal;
	
	
//	@JsonbTransient
//	@ManyToMany(fetch = FetchType.LAZY , cascade = { CascadeType.ALL })
//	@JoinTable( name ="personne_adresse",
//	joinColumns=@JoinColumn(name="adresse_id"),
//	inverseJoinColumns=@JoinColumn(name="personne_id"))
//	private List<Personne> personnes=new ArrayList<Personne>();
	
	
	
}
