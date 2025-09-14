package sequential;

import br.com.devforge.entity.Circulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class CirculoTest {

    @Test
    void calculaAreaCorretamente() {
        Circulo circulo = new Circulo(2.0);
        double areaEsperada = Math.PI * 2 * 2;
        assertEquals(areaEsperada, circulo.calcularArea(), 0.0001);
    }

    @Test
    void raioNegativoDeveLancarException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Circulo(-5);
        });
        assertEquals("Raio deve ser maior que ZERO (0).", exception.getMessage());
    }
}
