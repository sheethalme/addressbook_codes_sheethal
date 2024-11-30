package com.marian.DoneBook.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marian.DoneBook.model.doneModel;

@Repository
public interface doneRepo extends JpaRepository<doneModel,Integer>{

}
