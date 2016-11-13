package ma.samidev.discorum.dao;

import ma.samidev.discorum.entite.Collaborateur;

public interface CollaborateurDao {

	Collaborateur findCollaborateur(String identifiant);
	
	Collaborateur addCollaborateur(Collaborateur collaborateur);

}