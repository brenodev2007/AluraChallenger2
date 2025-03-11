package Breno_2.AluraChallenger2.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "Despesa")
public class Despesa {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "valor")
    private String valor;

    @Column(name = "data")
    private Date data;
}
