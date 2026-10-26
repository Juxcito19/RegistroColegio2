package modelo;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    public void testCalcularEdadRespetaElCumpleanios() {
        Persona persona = new Persona();
        persona.setFechaNacimiento(LocalDate.of(2000, 6, 15));
        assertEquals(25, persona.calcularEdad(LocalDate.of(2026, 6, 14)));
        assertEquals(26, persona.calcularEdad(LocalDate.of(2026, 6, 15)));
    }

    @Test
    public void testCalcularEdadSinFechaDevuelveCero() {
        assertEquals(0, new Persona().calcularEdad());
    }
}
