package com.projeto.helpdesk.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.helpdesk.domain.Chamado;
import com.projeto.helpdesk.repository.ChamadoRepository;
import com.projeto.helpdesk.service.exceptions.ObjectnotFoundException;

@Service
public class ChamadoService {

	@Autowired
	ChamadoRepository repository;

	public Chamado findById(Integer id) {
		Optional<Chamado> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectnotFoundException("Chamado não encontrado! ID: " + id));
	}

}
