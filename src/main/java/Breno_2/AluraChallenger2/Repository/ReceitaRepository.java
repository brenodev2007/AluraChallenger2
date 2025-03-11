package Breno_2.AluraChallenger2.Repository;

import Breno_2.AluraChallenger2.Entity.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceitaRepository extends JpaRepository <Receita, Long> {
}
