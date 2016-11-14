package ma.samidev.discorum.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ma.samidev.discorum.entite.Collaborateur;

@Repository
public class CollaborateurDaoImpl implements CollaborateurDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Collaborateur findCollaborateur(String identifiant) {
		return entityManager.find(Collaborateur.class, identifiant);
	}
	
	@Override
	public Collaborateur addCollaborateur(Collaborateur collaborateur) {
		entityManager.persist(collaborateur);
		return collaborateur;
	}
	
	@Override
	public boolean updateCollaborateur(String identifiant, Collaborateur collaborateur) {
		Collaborateur c = findCollaborateur(identifiant);
		if (c != null) {
			c.setNom(collaborateur.getNom());
			c.setPrenom(collaborateur.getPrenom());
			c.setDateNaissance(collaborateur.getDateNaissance());
			c.setGenre(collaborateur.getGenre());
			return true;
		}
		return false;
	}

}
