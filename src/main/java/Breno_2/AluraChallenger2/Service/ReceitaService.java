package Breno_2.AluraChallenger2.Service;

import Breno_2.AluraChallenger2.Entity.Receita;
import Breno_2.AluraChallenger2.Repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceitaService {

    @Autowired
    private ReceitaRepository receitaRepository;


    public Page<Receita> getAllReceitas(int page){
        Pageable pageable = PageRequest.of(page, 5);
        return receitaRepository.findAll(pageable);
    }

    public Receita getRecebitasbyDescricao(String descricao){
        return receitaRepository.findByDescricao(descricao);
    }

    public Receita getReceitaById(Long id){
        return receitaRepository.findById(id).get();
    }

    public List<Receita> getReceitaByAnoAndMes(int ano, int mes){
        return receitaRepository.findByAnoAndMes(ano, mes);
    }

    public Receita criarReceita(Receita receita){
        return receitaRepository.save(receita);
    }

    public void deletarReceita(Long id){
        receitaRepository.deleteById(id);
    }

    public Receita atualizarReceita(Receita receita){
        return receitaRepository.save(receita);
    }
}
