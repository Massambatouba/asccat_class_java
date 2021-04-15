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
public class Commission {
	@Id
private String id;
private String nom ;
/*
 * private String organisation; private String finance; private String
 * culturelle; private String sociale;
 */


}
