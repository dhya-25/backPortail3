package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.ComptePersDAO;
import com.arabsoft.ajir.entities.ComptePers;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/comptepers")
public class Compteperscontroller {
	@Autowired 
	ComptePersDAO cc;
	
	@GetMapping("/getall/{codsoc}/{matpers}/{typebul}")
	public List <ComptePers> get( @PathVariable("codsoc")String x,@PathVariable("matpers")String y,@PathVariable("typebul")String z)
	{return cc.getComptePers(x,y,z);}
	
	
	
	
	

}
