/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Profesor extends Persona {

    private static final double PORCENTAJE_PREPARACION = 0.30;
    private static final double PORCENTAJE_PRESTACIONES = 0.19;

    private String cedula;
    private String area;
    private double salarioHora;
    private int horasDictadas;

        public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}
