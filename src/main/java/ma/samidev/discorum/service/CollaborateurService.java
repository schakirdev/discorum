package ma.samidev.discorum.service;

import ma.samidev.discorum.entite.Collaborateur;

public interface CollaborateurService {
	
	Collaborateur findCollaborateur(String identifiant);
	
	Collaborateur addCollaborateur(Collaborateur collaborateur);

}