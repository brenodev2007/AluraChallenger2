package Breno_2.AluraChallenger2.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cor")
    private String cor;
}
