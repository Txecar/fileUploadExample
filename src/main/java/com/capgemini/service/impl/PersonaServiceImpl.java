package com.capgemini.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.IPersonaDao;
import com.capgemini.entities.Persona;
import com.capgemini.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService{

	@Autowired
	private IPersonaDao daoPersona;
	
	@Override
	public List<Persona> personas() {
		return daoPersona.findAll();
	}

	@Override
	public Persona getPersona(String id) {
		return daoPersona.getById(Long.parseLong(id));
	}

	@Override
	public void guardar(Persona persona) {
		daoPersona.save(persona);	
	}

}
