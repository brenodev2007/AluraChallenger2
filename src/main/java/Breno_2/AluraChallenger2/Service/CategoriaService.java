package Breno_2.AluraChallenger2.Service;

import Breno_2.AluraChallenger2.Entity.Categoria;
import Breno_2.AluraChallenger2.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> getAllCategorias(){
        return categoriaRepository.findAll();
    }

    public Categoria getCategoriaById(Long id){
        return categoriaRepository.findById(id).get();
    }

    public Categoria criarCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public Categoria atualizarCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public void deletarCategoria(Long id){
        categoriaRepository.deleteById(id);
    }




}
