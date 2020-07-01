package Teles.Daniel.ProjetoFinalPokemon.service;

import Teles.Daniel.ProjetoFinalPokemon.model.Pokemon;
import Teles.Daniel.ProjetoFinalPokemon.repository.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Daniel Teles
 * @version 1.0
 * @category Service
 * @since 13:36 27/06/2020
 */
@Service
public class PokemonFindAllService {

    @Autowired
    private PokemonRepository pokemonRepository;

    public List<Pokemon> findAll() {
        return (List<Pokemon>) pokemonRepository.findAll();
    }

}
