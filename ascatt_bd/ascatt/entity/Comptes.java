package ascatt_bd.ascatt.entity;

import java.sql.Date;

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
public class Comptes  {
	@Id
	private Long Id;
	private Date dernier_Delai;
	private String budget_prévu;
	private String Rib_compte;
	private String nom_compte;
	private Double solde;
}
