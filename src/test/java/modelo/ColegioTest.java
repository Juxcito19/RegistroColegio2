package modelo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ColegioTest {

    private Colegio colegio;

    private Profesor crearProfesor(Profesor p, String nombre) {
        p.setNombre(nombre);
        p.setSalarioHora(10000);
        p.setHorasDictadas(100);
        return p;
    }

    @BeforeEach
    public void setUp() {
        colegio = new Colegio();
        ProfesorPlanta ana = (ProfesorPlanta) crearProfesor(new ProfesorPlanta(), "Ana");   
        ana.setAniosAntiguedad(5);
        Profesor beto = crearProfesor(new ProfesorCatedra(80000), "Beto");                  
        Profesor carlos = crearProfesor(new Profesor(), "Carlos");                          
        // Profe aqui los registre en desorden a proposito
        colegio.registrarProfesor(carlos);
        colegio.registrarProfesor(ana);
        colegio.registrarProfesor(beto);
    }

    @Test
    public void testReporteEstudiantesListaLosRegistrados() {
        assertTrue(colegio.reporteEstudiantes().contains("No hay estudiantes registrados"));

        Estudiante e = new Estudiante();
        e.setNombre("Pedro");
        e.setCodigo("E-001");
        colegio.registrarEstudiante(e);

        String reporte = colegio.reporteEstudiantes();
        assertTrue(reporte.contains("Pedro"));
        assertTrue(reporte.contains("E-001"));
    }

    @Test
    public void testReporteProfesoresOrdenadoDeMayorAMenorSalario() {
        String reporte = colegio.reporteProfesoresPorSalario();
        int posAna = reporte.indexOf("Nombre: Ana");
        int posBeto = reporte.indexOf("Nombre: Beto");
        int posCarlos = reporte.indexOf("Nombre: Carlos");

        assertTrue(posAna >= 0 && posAna < posBeto && posBeto < posCarlos);
    }

    @Test
    public void testReporteProfesoresIncluyeTotalDePrestaciones() {
        assertTrue(colegio.reporteProfesoresPorSalario().contains("780900"));
    }
}
