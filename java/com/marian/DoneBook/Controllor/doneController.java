package com.marian.DoneBook.Controllor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marian.DoneBook.Service.doneService;
import com.marian.DoneBook.model.doneModel;

@RestController
//@CrossOrigin(origins="http://localhost:3000")
public class doneController {
	
	@Autowired
	public doneService ds;
	
	@GetMapping("/api/done")
	public List<doneModel> Details(){
		return ds.getDetails();
	}
	
	@PostMapping("/api/done")
	public doneModel saveDetails(@RequestBody doneModel done)
	{
		return ds.giveDetails(done);
	}
	

	
}
