package Breno_2.AluraChallenger2.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "Receita")
public class Receita {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "descricao", unique = true)
    private String descricao;

    @Column(name = "valor")
    private String valor;

    @Column(name = "data")
    private Date data;
}
