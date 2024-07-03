package br.com.alura.screenmatch_frases.services;

import br.com.alura.screenmatch_frases.dto.FraseDTO;
import org.springframework.beans.factory.annotation.Autowired;

public class FraseService {
    @Autowired
    private FraseRepository repositorio;

    public FraseDTO obterFraseAleatoria() {
        return repositorio.
    }
}
