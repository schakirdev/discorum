package ma.samidev.discorum.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.samidev.discorum.dao.CollaborateurDao;
import ma.samidev.discorum.entite.Collaborateur;

@Service
public class CollaborateurServiceImpl implements CollaborateurService {

	@Autowired
	private CollaborateurDao collaborateurDao;
	
	@Override
	public Collaborateur findCollaborateur(String identifiant) {
		return collaborateurDao.findCollaborateur(identifiant);
	}
	
	@Override
	@Transactional
	public Collaborateur addCollaborateur(Collaborateur collaborateur) {
		return collaborateurDao.addCollaborateur(collaborateur);
	}

}
