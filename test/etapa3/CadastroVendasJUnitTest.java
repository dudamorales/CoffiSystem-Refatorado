package etapa3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CadastroVendasJUnitTest {

    @Test
    public void testarCalculoVenda() {
        double resultado = CadastroVendas.calcularValorTotal(10, 2, 10);

        assertEquals(18, resultado);
    }
}