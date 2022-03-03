package com.example.demo;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveNameService {

	@Autowired
	private SaveNameRepository repo;
	
	public SaveName newadd(SaveName savename)
	{
		UUID uuid = UUID.randomUUID();
		savename.setNid(uuid.toString());
		return repo.save(savename);
	}
}
