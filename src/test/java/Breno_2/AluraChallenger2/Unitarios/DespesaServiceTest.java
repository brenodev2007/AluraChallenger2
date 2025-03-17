package Breno_2.AluraChallenger2.Unitarios;

import Breno_2.AluraChallenger2.Entity.Despesa;
import Breno_2.AluraChallenger2.Repository.DespesaRepository;
import Breno_2.AluraChallenger2.Service.DespesaService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class DespesaServiceTest {

    @Mock
    private DespesaRepository despesaRepository;

    @InjectMocks
    private DespesaService despesaService;

    @Test
    void DevecriarDespesacomSucesso(){
        Despesa despesa = new Despesa();
        despesa.setDescricao("Teste");
        despesa.setValor(100.0);
        despesa.setCategoria(null);


        Despesa resultado = despesaService.criarDespesa(despesa);

        //verificações
        assertEquals(despesa.getDescricao(), resultado.getDescricao());
        assertEquals(despesa.getValor(), resultado.getValor());
        assertEquals(despesa.getCategoria(), resultado.getCategoria());

    }
}
