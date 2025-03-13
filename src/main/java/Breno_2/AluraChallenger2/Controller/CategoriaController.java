package Breno_2.AluraChallenger2.Controller;

import Breno_2.AluraChallenger2.Entity.Categoria;
import Breno_2.AluraChallenger2.Service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;



    @GetMapping("/categorias")
    public List<Categoria> getAllCategorias(){
        return categoriaService.getAllCategorias();
    }


    @GetMapping("/categorias/{id}")
    public Categoria getCategoriaById(Long id){
        return categoriaService.getCategoriaById(id);
    }

    @PostMapping("/categorias")
    public Categoria criarCategoria(@RequestBody Categoria categoria){
        return categoriaService.criarCategoria(categoria);
    }

    @PutMapping("/categorias")
    public Categoria atualizarCategoria(@RequestBody Categoria categoria){
        return categoriaService.atualizarCategoria(categoria);
    }

    @DeleteMapping("/categorias/{id}")
    public void deletarCategoria(@PathVariable Long id){
        categoriaService.deletarCategoria(id);
    }

}
