package Breno_2.AluraChallenger2.Controller;


import Breno_2.AluraChallenger2.Entity.Receita;
import Breno_2.AluraChallenger2.Service.ReceitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReceitaController {

    @Autowired
    private ReceitaService receitaService;

    @GetMapping("/receitas")
    public List<Receita> getAllReceitas(){
        return receitaService.getAllReceitas();
    }

    @GetMapping("/receita/{id}")
    public Receita getReceitaById(Long id){
        return receitaService.getReceitaById(id);
    }

    @PostMapping("/receita")
    public Receita criarReceita(Receita receita){
        return receitaService.criarReceita(receita);
    }

    @PutMapping("/receita")
    public Receita atualizarReceita(@RequestBody Receita receita){
        return receitaService.atualizarReceita(receita);
    }

    @DeleteMapping("/receita/{id}")
    public void deletarReceita(Long id){
        receitaService.deletarReceita(id);
    }



}
