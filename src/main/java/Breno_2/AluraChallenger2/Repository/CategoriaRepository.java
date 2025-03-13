package Breno_2.AluraChallenger2.Repository;

import Breno_2.AluraChallenger2.Entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Long> {
}
