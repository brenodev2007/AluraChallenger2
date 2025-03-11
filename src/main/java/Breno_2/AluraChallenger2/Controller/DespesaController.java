package Breno_2.AluraChallenger2.Controller;

import Breno_2.AluraChallenger2.Entity.Despesa;
import Breno_2.AluraChallenger2.Service.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DespesaController {

    @Autowired
    private DespesaService despesaService;

    @GetMapping("/despesas")
    public List<Despesa> getAllDespesas(){
        return despesaService.getAllDespesas();
    }

    @GetMapping("/despesa/{id}")
    public Despesa getDespesaById(Long id){
        return despesaService.getDespesaById(id);
    }

    @PostMapping("/despesa")
    public Despesa criarDespesa(Despesa despesa){
        return despesaService.criarDespesa(despesa);
    }

    @PutMapping("/despesa")
    public Despesa atualizarDespesa( @RequestBody Despesa despesa){
        return despesaService.atualizarDespesa(despesa);
    }

    @DeleteMapping("/despesa/{id}")
    public void deletarDespesa(Long id){
        despesaService.deletarDespesa(id);
    }
}
