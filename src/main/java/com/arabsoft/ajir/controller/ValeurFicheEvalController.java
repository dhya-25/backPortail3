package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.VALEUR_FICHE_EVALDao;
import com.arabsoft.ajir.entities.VALEUR_FICHE_EVAL;

@RestController
@CrossOrigin("*")
@RequestMapping("/valeurficheeval")
public class ValeurFicheEvalController {
	@Autowired
	VALEUR_FICHE_EVALDao dao;

	@GetMapping("/getvaleurficheeval/{mat}/{ref}")
	public List<VALEUR_FICHE_EVAL> getvaleurficheevall(@PathVariable("mat") String mat,@PathVariable("ref") String ref) {
   // TODO document why this method is empty
		return dao.getFicheEval(mat,ref);
 }

}
