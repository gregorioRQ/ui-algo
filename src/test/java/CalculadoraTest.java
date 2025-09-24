import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.pola.Calculadora;

public class CalculadoraTest {
    @Test
    void testSuma() {
        Calculadora c = new Calculadora();
        int resultado = c.sumar(1, 2);
        assertEquals(resultado, 3);
    }
}
