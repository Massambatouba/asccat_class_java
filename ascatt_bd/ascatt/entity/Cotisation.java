package ascatt_bd.ascatt.entity;



import java.sql.Date;
import java.util.List;

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
public class Cotisation {
	@Id
	private int id_Cotisation;
	private int  sass;
	private Date date_limite;
	@OneToMany
	private List<Barkelou> barkelous; 
	@OneToMany
	private List<Membre> membre;
	
}
