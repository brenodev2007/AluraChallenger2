package Breno_2.AluraChallenger2.Repository;

import Breno_2.AluraChallenger2.Entity.Categoria;
import Breno_2.AluraChallenger2.Entity.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa,Long> {
    public Despesa findByDescricao(String descricao);
    public Despesa findByCategoria(Categoria categoria);
    @Query("SELECT r FROM Receita r WHERE YEAR(r.data) = :ano AND MONTH(r.data) = :mes")
    List<Despesa> findByAnoAndMes(@Param("ano") int ano, @Param("mes") int mes);
}
