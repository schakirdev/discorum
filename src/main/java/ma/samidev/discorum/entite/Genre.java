package ma.samidev.discorum.entite;

public enum Genre {
	
	FEMALE("F"), MALE("M");
	
	private String valeur;
	
	private Genre(String valeur) {
		this.valeur = valeur;
	}
	
	public String getValeur() {
		return valeur;
	}	

}
