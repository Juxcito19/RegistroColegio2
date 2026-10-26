/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.time.LocalDate;
import java.time.Period;
/**
 *
 * @author Usuario
 */
public class Persona {
    
    private String nombre;
    private String direccion;
    private String telefono;
    private LocalDate fechaNacimiento;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
        public int calcularEdad() {
        return calcularEdad(LocalDate.now());
    }

    public int calcularEdad(LocalDate fechaReferencia) {
        if (fechaNacimiento == null || fechaReferencia == null) {
            return 0;
        }
        return Period.between(fechaNacimiento, fechaReferencia).getYears();
    }
        @Override
    public String toString() {
        return "Nombre: " + nombre
                + " | Dirección: " + direccion
                + " | Teléfono: " + telefono
                + " | Edad: " + calcularEdad();
    }
}