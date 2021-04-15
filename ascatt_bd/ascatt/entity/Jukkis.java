package ascatt_bd.ascatt.entity;

import org.springframework.context.annotation.Configuration;
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
@Configuration
public class Jukkis {
	private String id;
	private int numero;
	private String statut;
	@ManyToOne
	private Kamil kamil;
	
}
