package ascatt_bd.ascatt.entity;

import java.util.Collection;



import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Document
@Data 
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Configuration
public class Membre {
	@Id
	private String id;
	private String nom;
	private String prenom;
	@ManyToOne
	private Daara daara;
	@ManyToOne
	private Profil profil;
	@OneToMany
	private Collection<Jukkis> jukkis;
	@ManyToOne
	private Commission commission;
	@OneToMany
	private Collection<Cotisation> cotisation;
	
	
	
	
	

}
