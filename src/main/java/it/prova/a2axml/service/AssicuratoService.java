package it.prova.a2axml.service;

import java.util.List;

import it.prova.a2axml.model.AssicuratoModel;

public interface AssicuratoService {

	public List<AssicuratoModel> listAllAssicurati();

	public AssicuratoModel caricaSingoloPaziente(Long id);

	public AssicuratoModel aggiorna(AssicuratoModel assicuratoInstance);

	public AssicuratoModel inserisciNuovo(AssicuratoModel assicuratoInstance);

	public void rimuovi(Long idToRemove);
	
}
