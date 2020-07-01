package Teles.Daniel.ProjetoFinalPokemon.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Daniel Teles
 * @version 1.0
 * @category Model
 * @since 13:24 27/06/2020
 */

@RestController
@CrossOrigin( origins = "*" , allowedHeaders = "*")
public class HomeController {

    @RequestMapping("/")
    public ResponseEntity<String> index() {
        return new ResponseEntity<String>("Bem Vindo, está é a página principal.",
                                            new HttpHeaders(), HttpStatus.OK);
    }
}
