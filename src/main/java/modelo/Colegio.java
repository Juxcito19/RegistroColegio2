/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Registro de profesores y estudiantes del colegio.
 * @author Usuario
 */
public class Colegio {

    private String nombre;
    private ArrayList<Profesor> profesores = new ArrayList<>();
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void registrarProfesor(Profesor p) {
        profesores.add(p);
    }

    public void registrarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    // Reporte 1: lista de estudiantes
    public String reporteEstudiantes() {
        StringBuilder sb = new StringBuilder("=== LISTA DE ESTUDIANTES ===\n");
        if (estudiantes.isEmpty()) {
            sb.append("No hay estudiantes registrados.\n");
        }
        for (Estudiante e : estudiantes) {
            sb.append(e.toString()).append("\n");
        }
        return sb.toString();
    }

    // Reporte 2: profesores de mayor a menor salario, con total de prestaciones
    public String reporteProfesoresPorSalario() {
        ArrayList<Profesor> copia = new ArrayList<>(profesores);
        copia.sort(Comparator.comparingDouble((Profesor p) -> p.calcularPagoMensual()).reversed());

        StringBuilder sb = new StringBuilder("=== PROFESORES POR SALARIO (mayor a menor) ===\n");
        double totalPrestaciones = 0;
        for (Profesor p : copia) {
            sb.append(p.toString()).append("\n");
            totalPrestaciones += p.calcularPrestaciones();
        }
        sb.append("\nTOTAL PRESTACIONES SOCIALES: ")
          .append(String.format("%.2f", totalPrestaciones)).append("\n");
        return sb.toString();
    }
}
