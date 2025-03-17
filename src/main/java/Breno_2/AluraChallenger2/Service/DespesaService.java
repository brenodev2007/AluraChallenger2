package Breno_2.AluraChallenger2.Service;

import Breno_2.AluraChallenger2.Entity.Categoria;
import Breno_2.AluraChallenger2.Entity.Despesa;
import Breno_2.AluraChallenger2.Entity.Receita;
import Breno_2.AluraChallenger2.Repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {

    @Autowired
    private DespesaRepository despesaRepository;

    public Page<Despesa> getAllDespesas(int page){
        Pageable pageable = PageRequest.of(page, 5);
        return despesaRepository.findAll(pageable);
    }

    public Despesa getDespesaById(Long id){
        return despesaRepository.findById(id).get();
    }

    public List<Despesa> getDespesaByCategoria(Categoria categoria){
        return (List<Despesa>) despesaRepository.findByCategoria(categoria);
    }

    public Despesa getDespesaByDescricao(String descricao){
        return despesaRepository.findByDescricao(descricao);
    }

   public List<Despesa> getDespesaByAnoAndMes(int ano, int mes){
        return despesaRepository.findByAnoAndMes(ano, mes);
    }

    public Despesa criarDespesa(Despesa despesa){
        return despesaRepository.save(despesa);
    }

    public Despesa atualizarDespesa(Despesa despesa){
        return despesaRepository.save(despesa);
    }

    public void deletarDespesa(Long id){
        despesaRepository.deleteById(id);
    }


}
