package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.FamilleDao;
import com.arabsoft.ajir.entities.Famille;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/famille")
public class FamilleController {
	@Autowired
	FamilleDao fam;

	@GetMapping("/getconjoint/{codsoc}/{matpers}")
	public List<Famille> GETALLBY(@PathVariable("codsoc") String x, @PathVariable("matpers") String y) {
		return fam.getbymatandsoc(x, y);
	}

	@GetMapping("/getenfant/{codsoc}/{matpers}")
	public List<Famille> GETenfant(@PathVariable("codsoc") String x, @PathVariable("matpers") String y) {

		List<Famille> f = fam.getbymatandsocbyenfant(x, y);

		for (int i = 0; i < f.size(); i++) {
			String s = f.get(i).getSexe();
			String b = f.get(i).getBoursier();
			if (s == null) {
				f.get(i).setSexe("");
			}

			else if (s.equals("M")) {

				f.get(i).setSexe("Masculin");

			} else if (s.equals("F")) {

				f.get(i).setSexe("Feminin");

			} else if (s.isEmpty()) {
				f.get(i).setSexe("nulll");
			}
			if (b == null) {
				f.get(i).setBoursier("");
			}

			else if (b.equals("O")) {

				f.get(i).setBoursier("Oui");

			} else if (b.equals("N")) {

				f.get(i).setBoursier("Non");

			} else if (b.isEmpty()) {
				f.get(i).setBoursier("nulll");
			}

		}

		// if (b=="O") {

		// f.get(i).setBoursier("Oui");

		// }
		// else if (b=="N") {

		// f.get(i).setBoursier("Non");

		// }
		// else { f.get(i).setBoursier(f.get(i).getBoursier());}
		// }

		return f;
	}
}
