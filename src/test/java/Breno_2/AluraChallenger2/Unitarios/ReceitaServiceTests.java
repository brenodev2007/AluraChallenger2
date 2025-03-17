package Breno_2.AluraChallenger2.Unitarios;

import Breno_2.AluraChallenger2.Entity.Receita;
import Breno_2.AluraChallenger2.Repository.ReceitaRepository;
import Breno_2.AluraChallenger2.Service.ReceitaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class ReceitaServiceTests {

    @Mock
    private ReceitaRepository receitaRepository;

    @InjectMocks
    private ReceitaService receitaService;

    @Test
    void DevecriarReceitacomSucesso(){
        Receita receita = new Receita();
        receita.setDescricao("Teste");
        receita.setValor("100.0");



        Receita resultado = receitaService.criarReceita(receita);

        //verificações
        assertEquals(receita.getDescricao(), resultado.getDescricao());
        assertEquals(receita.getValor(), resultado.getValor());


    }
}
