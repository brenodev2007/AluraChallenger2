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

    @Column(name = "descricao", unique = true)
    private String descricao;

    @Column(name = "valor")
    private Double valor;

    @Column(name = "data")
    private Date data;

    @JoinColumn
    @ManyToOne
    private Categoria categoria;
}
