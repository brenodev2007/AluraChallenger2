package Breno_2.AluraChallenger2.Repository;

import Breno_2.AluraChallenger2.Entity.Categoria;
import Breno_2.AluraChallenger2.Entity.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa,Long> {
    public Despesa findByDescricao(String descricao);
    public Despesa findByCategoria(Categoria categoria);
}
