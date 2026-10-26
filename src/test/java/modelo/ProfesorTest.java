package modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfesorTest {

    private Profesor profesor;

    @BeforeEach
    public void setUp() {
        profesor = new Profesor();
        profesor.setSalarioHora(10000);
        profesor.setHorasDictadas(100);
    }

    @Test
    public void testPagoMensualIncluyeTreintaPorCientoDePreparacion() {
        // 10000 * 100 = 1.000.000 + 30% = 1.300.000
        assertEquals(1300000, profesor.calcularPagoMensual(), 0.01);
    }

    @Test
    public void testPagoMensualSobrecargadoConHoras() {
        // 10000 * 50 = 500.000 + 30% = 650.000
        assertEquals(650000, profesor.calcularPagoMensual(50), 0.01);
    }

    @Test
    public void testPrestacionesSonDiecinuevePorCientoDelPago() {
        // 1.300.000 * 19% = 247.000
        assertEquals(247000, profesor.calcularPrestaciones(), 0.01);
    }
}
