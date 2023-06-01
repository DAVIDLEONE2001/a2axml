package it.prova.a2axml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.prova.a2axml.model.AssicuratoModel;
import it.prova.a2axml.repository.AssicuratoRepository;

@Service
public class AssicuratoServiceImpl implements AssicuratoService {

	@Autowired
	private AssicuratoRepository repository;

	@Override
	public List<AssicuratoModel> listAllAssicurati() {
		return (List<AssicuratoModel>) repository.findAll();
	}

	@Override
	public AssicuratoModel caricaSingoloPaziente(Long id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public AssicuratoModel aggiorna(AssicuratoModel assicuratoInstance) {
		return repository.save(assicuratoInstance);
	}

	@Override
	public AssicuratoModel inserisciNuovo(AssicuratoModel assicuratoInstance) {
		return repository.save(assicuratoInstance);
	}

	@Override
	public void rimuovi(Long idToRemove) {

		repository.deleteById(idToRemove);
		
	}

}
