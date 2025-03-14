package Breno_2.AluraChallenger2.Repository;

import Breno_2.AluraChallenger2.Entity.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReceitaRepository extends JpaRepository <Receita, Long> {
    public Receita findByDescricao(String descricao);
    @Query("SELECT r FROM Receita r WHERE YEAR(r.data) = :ano AND MONTH(r.data) = :mes")
    List<Receita> findByAnoAndMes(@Param("ano") int ano, @Param("mes") int mes);
}
