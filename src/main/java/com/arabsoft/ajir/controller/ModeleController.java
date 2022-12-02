package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.MODELEDao;
import com.arabsoft.ajir.entities.MODELE;

@RestController
@CrossOrigin("*")
@RequestMapping("/Mod")
public class ModeleController {
	@Autowired MODELEDao dao;
	
	@GetMapping("/getall")
	
	public List<MODELE> getall(){
		
		return dao.findAll();
		
		
	}

}
