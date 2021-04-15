package ascatt_bd.ascatt.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
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

public class Kamil {
	@Id
	private String id_amil;
	private String nom_kamil;
	private Date date_Ouverture;
	private Date date_fermeture;
	private int fréquence;
	@ManyToOne
	private Daara daara;
	@OneToMany
	private Collection<Jukkis> jukkis ;

}
