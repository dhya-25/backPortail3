package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.AffilpersDao;
import com.arabsoft.ajir.entities.AFFIL_PERS;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/affilprs")
public class AfilpersControler {
	@Autowired
	AffilpersDao affil ;
	@GetMapping("/get/{cod}/{matpers}")
	public List <AFFIL_PERS> get(@PathVariable("cod")String cod,@PathVariable("matpers")String mat) {
		return (List <AFFIL_PERS>)affil.getAFFIL_PERS(cod, mat);}

}
