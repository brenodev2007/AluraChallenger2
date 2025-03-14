package Breno_2.AluraChallenger2.Controller;

import Breno_2.AluraChallenger2.Entity.Categoria;
import Breno_2.AluraChallenger2.Entity.Despesa;
import Breno_2.AluraChallenger2.Service.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/despesas/{categoria}")
    public List<Despesa> getDespesaByCategoria(Categoria categoria){
        return despesaService.getDespesaByCategoria(categoria);
    }

    @GetMapping("/despesas/{descricao}")
    public Despesa getDespesaByDescricao(String descricao){
        return despesaService.getDespesaByDescricao(descricao);
    }

    @PostMapping("/despesas")
    public Despesa criarDespesa(Despesa despesa){
        return despesaService.criarDespesa(despesa);
    }

    @PutMapping("/despesas")
    public Despesa atualizarDespesa( @RequestBody Despesa despesa){
        return despesaService.atualizarDespesa(despesa);
    }

    @DeleteMapping("/despesas/{id}")
    public ResponseEntity<String> deletarDespesa(@PathVariable Long id) {
        despesaService.deletarDespesa(id);
        return ResponseEntity.ok("Despesa deletada com sucesso!");
    }
}
