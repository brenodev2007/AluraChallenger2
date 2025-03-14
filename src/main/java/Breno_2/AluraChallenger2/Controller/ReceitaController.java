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

    @GetMapping("/receitas/{descricao}")
    public Receita getReceitasbyDescricao(@RequestBody String descricao){
        return receitaService.getRecebitasbyDescricao(descricao);
    }

    @GetMapping("/receita/{id}")
    public Receita getReceitaById(Long id){
        return receitaService.getReceitaById(id);
    }

    @GetMapping("/receitas/{ano}/{mes}")
    public List<Receita> getReceitaByAnoAndMes(@PathVariable int ano, @PathVariable int mes){
        return receitaService.getReceitaByAnoAndMes(ano, mes);
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
