package ascatt_bd.ascatt.entity;

import java.sql.Date;
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
public class Profil {
	@Id
	private Long id;
	private String Admin;
	private String Membre_commission ;
	@OneToMany
	private Collection<Membre> membre;
}
