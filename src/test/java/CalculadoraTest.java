import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.pola.Calculadora;

public class CalculadoraTest {
    static Calculadora c;

    @BeforeEach
    void setUp() {
        c = new Calculadora();
    }

    @Test
    void testSuma() {

        int resultado = c.sumar(1, 2);
        assertEquals(resultado, 3);
        assertInstanceOf(Integer.class, resultado);
    }

    @Test
    void testResta() {
        int resultado = c.rest(4, 1);
        assertEquals(resultado, 3);
    }
}
