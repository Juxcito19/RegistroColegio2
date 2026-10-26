package modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProfesorCatedraTest {

    private ProfesorCatedra catedra;

    @BeforeEach
    public void setUp() {
        catedra = new ProfesorCatedra(80000);
        catedra.setSalarioHora(10000);
        catedra.setHorasDictadas(100);
    }

    @Test
    public void testPagoMensualSumaAuxilioDeTransporte() {
        assertEquals(80000, catedra.getAuxilioTransporte(), 0.01);
        assertEquals(1380000, catedra.calcularPagoMensual(), 0.01);
    }

    @Test
    public void testPolimorfismoPrestacionesUsanElPagoDeLaSubclase() {
        Profesor p = catedra;
        assertEquals(262200, p.calcularPrestaciones(), 0.01);
    }
}
