package com.marian.DoneBook.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marian.DoneBook.Repository.doneRepo;
import com.marian.DoneBook.model.doneModel;

@Service
public class doneService {
	
	@Autowired
	public doneRepo doRepo;
	
	public List<doneModel> getDetails(){
		return doRepo.findAll();
	}
	
	public doneModel giveDetails(doneModel done) {
		return doRepo.save(done);
	}
	

}
