package ascatt_bd.ascatt.entity;

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
public class Adresse {
	@Id
	private String id;
	private String pays;
	private String ville;
	private String numero;
	private String libelle;
	private int codePostale;
	

}
