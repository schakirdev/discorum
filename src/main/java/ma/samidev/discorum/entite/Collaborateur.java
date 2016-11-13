package ma.samidev.discorum.entite;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import ma.samidev.discorum.dao.converter.GenreConverter;

@Entity(name = "COLLABORATEUR")
public class Collaborateur {

	@Id
	@Column(name = "IDENTIFIANT")
	private String identifiant;
	@Column(name = "NOM")
	private String nom;
	@Column(name = "PRENOM")
	private String prenom;
	@Column(name = "DATENAISSANCE")
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	@Column(name = "GENRE")
	@Convert(converter = GenreConverter.class)
	private Genre genre;

	public Collaborateur() {

	}

	public Collaborateur(String identifiant, String nom, String prenom, Date dateNaissance, Genre genre) {
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.genre = genre;
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

}
