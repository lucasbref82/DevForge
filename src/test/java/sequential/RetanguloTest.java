package sequential;

import br.com.devforge.sequential.entity.Retangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RetanguloTest {

    @Test
    void calculaAreaCorretamente() {
        Retangulo retangulo = new Retangulo(2,2);
        double areaEsperada = retangulo.getBase() * retangulo.getAltura();
        assertEquals(areaEsperada, retangulo.calcularArea(), 0.0001);
    }

    @Test
    void deveRetornarExcessaoSeBaseOuAlturaNegativo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Retangulo(20, -1);
        });
        assertEquals("Base e altura devem ser maior ou igual a ZERO (0).", exception.getMessage());
    }

}
