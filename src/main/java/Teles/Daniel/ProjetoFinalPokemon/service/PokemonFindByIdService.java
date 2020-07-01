package Teles.Daniel.ProjetoFinalPokemon.service;

import Teles.Daniel.ProjetoFinalPokemon.model.Pokemon;
import Teles.Daniel.ProjetoFinalPokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Daniel Teles
 * @version 1.0
 * @category Service
 * @since 13:40 27/06/2020
 */

@Service
public class PokemonFindByIdService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public Pokemon findById(long id) {
        return pokemonRepository.findById(id).get();
    }
}
