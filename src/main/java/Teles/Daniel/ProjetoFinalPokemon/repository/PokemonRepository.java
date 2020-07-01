package Teles.Daniel.ProjetoFinalPokemon.repository;

import Teles.Daniel.ProjetoFinalPokemon.model.Pokemon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Daniel Teles
 * @version 1.0
 * @category Interface
 * @since 13:12 27/06/2020
 */

@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, Long> {

}
