package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.ScolFam;
import com.arabsoft.ajir.entities.SCOLARITE_FAMILLE;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/scofam")
public class Scolaritefamcontroller {
	@Autowired
	ScolFam soc;
	@GetMapping("/getscol/{codSoc}/{matPaers}")
	public List <SCOLARITE_FAMILLE> getInfosPerse(@PathVariable("codSoc") String c,@PathVariable("matPaers") String p) {

		return (List <SCOLARITE_FAMILLE>) soc.getscofam(c, p);
	}

}
