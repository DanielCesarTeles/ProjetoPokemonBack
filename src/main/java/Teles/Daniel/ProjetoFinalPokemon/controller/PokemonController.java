package Teles.Daniel.ProjetoFinalPokemon.controller;

import Teles.Daniel.ProjetoFinalPokemon.model.Pokemon;
import Teles.Daniel.ProjetoFinalPokemon.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Daniel Teles
 * @version 1.0
 * @category Controller
 * @since 13:50 27/06/2020
 */
@RestController
@RequestMapping("/pokedex")
@CrossOrigin( origins = "*" , allowedHeaders = "*")
public class PokemonController {

    @Autowired
    public PokemonDeleteService deleteService;

    @Autowired
    public PokemonFindAllService findAllService;

    @Autowired
    public PokemonFindByIdService findByIdService;

    @Autowired
    public PokemonSaveService  saveService;

    @Autowired
    public PokemonUpdateService updateService;

    @DeleteMapping(path = "{id}")
    public ResponseEntity<Pokemon> delete(@PathVariable("id") long id){
        this.deleteService.delete(id);
        return new ResponseEntity<Pokemon> (new HttpHeaders(),HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Pokemon>> findAll(){
        return new ResponseEntity<List<Pokemon>>((List<Pokemon>) this.findAllService.findAll(), new HttpHeaders(),
                                                                    HttpStatus.OK);
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Pokemon> findById(@PathVariable("id") long id) {
        Pokemon pokemon = this.findByIdService.findById(id);
        if (pokemon != null) {
            return new ResponseEntity<Pokemon>(pokemon, new HttpHeaders(), HttpStatus.OK);
        } {
            return new ResponseEntity<Pokemon> (HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Pokemon> save(@Valid @RequestBody Pokemon pokemon ) {
        return new ResponseEntity<Pokemon>(this.saveService.save(pokemon), new HttpHeaders(), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Pokemon> update(@RequestBody Pokemon pokemon ) {
        return new ResponseEntity<Pokemon>(this.updateService.update(pokemon), new HttpHeaders(), HttpStatus.OK);
    }







}
