package Teles.Daniel.ProjetoFinalPokemon.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

/**
 * @author Daniel Teles
 * @version 1.0
 * @category Model
 * @since 13:05 27/06/2020
 */

@Component
@Entity
@Table(name = "pokemon")

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "Id")
    private long id;

    @Column (name = "Nome")
    @NotBlank (message = "Nome inválido")
    private String name;

    @Column (name = "Geracao")
    private int generation;

    @Column (name = "Tipo")
    @NotBlank (message = "Tipo inválido")
    private String type;

    @Column (name = "Genero")
    @NotBlank (message = "Genero inválido")
    private String gender;

    @Column (name = "Fraquezas")
    @NotBlank (message = "Fraquezas inválidas")
    private String weaknesses;

    @Column (name = "Vantagens")
    @NotBlank (message = "Vantagens inválido")
    private String advantage;

}
