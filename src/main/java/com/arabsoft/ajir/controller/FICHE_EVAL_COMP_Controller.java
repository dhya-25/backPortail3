package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.FicheEvalDao;
import com.arabsoft.ajir.entities.FICHE_EVAL_COMP;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/FICHEEVALCOMP")

public class FICHE_EVAL_COMP_Controller {
	@Autowired
	FicheEvalDao FICHE;
	@GetMapping("/getfiche/{mat}/{ref}")
	public List<FICHE_EVAL_COMP> getFicheEval(@PathVariable("mat")String mat,@PathVariable("ref")String ref){
		return FICHE.getFicheEval(mat,ref);
		
		
		
		
		
		
	}
	

}
