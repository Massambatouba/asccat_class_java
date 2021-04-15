
package ascatt_bd.ascatt.entity;

import java.util.ArrayList;
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
public class Daara {
	@Id
	private String id;
	private String nom;
	@OneToMany
	private Collection<Membre> membres ;
	@OneToMany
	private Collection<Kamil> kamil;
	@OneToMany
	private Collection<Comptes> comptes;
}
