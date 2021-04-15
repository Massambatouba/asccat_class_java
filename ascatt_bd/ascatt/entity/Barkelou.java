package ascatt_bd.ascatt.entity;

import java.util.Date;


public class Barkelou {
	private Date date;
	private Double montant;
	@ManyToOne
	private Cotisation cotisation;
	

}
