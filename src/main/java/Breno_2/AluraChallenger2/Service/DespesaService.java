package Breno_2.AluraChallenger2.Service;

import Breno_2.AluraChallenger2.Entity.Despesa;
import Breno_2.AluraChallenger2.Repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {

    @Autowired
    private DespesaRepository despesaRepository;

    public List<Despesa> getAllDespesas(){

        return despesaRepository.findAll();
    }

    public Despesa getDespesaById(Long id){
        return despesaRepository.findById(id).get();
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
