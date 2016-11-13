package ma.samidev.discorum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ma.samidev.discorum.entite.Collaborateur;
import ma.samidev.discorum.service.CollaborateurService;

@RestController
public class CollaborateurRestController {

	@Autowired
	private CollaborateurService collaborateurService;
	
	@RequestMapping(value = "/collaborateur/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Collaborateur getCollaborateur(@PathVariable String id) {
		return collaborateurService.findCollaborateur(id);
	}
	
	@RequestMapping(value = "/collaborateur", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Collaborateur postCollaborateur(@RequestBody Collaborateur collaborateur) {
		return collaborateurService.addCollaborateur(collaborateur);
	}
	
}
