package modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfesorPlantaTest {

    private ProfesorPlanta planta;

    @BeforeEach
    public void setUp() {
        planta = new ProfesorPlanta();
        planta.setSalarioHora(10000);
        planta.setHorasDictadas(100);
        planta.setAniosAntiguedad(5);
    }

    @Test
    public void testPagoMensualIncluyeBonificacionPorAntiguedad() {
        // base 1.300.000 + (2% * 5 anios = 130.000) = 1.430.000
        assertEquals(130000, planta.calcularBonificacion(), 0.01);
        assertEquals(1430000, planta.calcularPagoMensual(), 0.01);
    }

    @Test
    public void testPolimorfismoPrestacionesUsanElPagoDeLaSubclase() {
        Profesor p = planta;
        // 1.430.000 * 19% = 271.700
        assertEquals(271700, p.calcularPrestaciones(), 0.01);
    }
}
