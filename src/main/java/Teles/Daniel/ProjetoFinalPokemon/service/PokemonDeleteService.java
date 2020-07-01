package Teles.Daniel.ProjetoFinalPokemon.service;

import Teles.Daniel.ProjetoFinalPokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Daniel Teles
 * @version 1.0
 * @category Service
 * @since 13:30 27/06/2020
 */

@Service
public class PokemonDeleteService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public void delete(long id) {
        pokemonRepository.deleteById(id);
    }
}
