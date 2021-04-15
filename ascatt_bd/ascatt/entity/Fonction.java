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
public class Fonction {
	@Id
	private String diawrigne;
	private String adjoin_diawrigne;
	private String diawrigne_commission;
	private String secretaire;
	private String trésorier;
    @ManyToOne
    private  Membre membres;


}
