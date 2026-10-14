/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class ProfesorPlanta extends Profesor {

    private static final double PORCENTAJE_ANTIGUEDAD = 0.02;

    private int aniosAntiguedad;
    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }
    public double calcularBonificacion() {
        return calcularBonificacion(super.calcularPagoMensual(getHorasDictadas()));
    }
    public double calcularBonificacion(double pagoBase) {
        return pagoBase * PORCENTAJE_ANTIGUEDAD * aniosAntiguedad;
    }
        @Override
    public double calcularPagoMensual(int horas) {
        double base = super.calcularPagoMensual(horas);
        return base + calcularBonificacion(base);
    }
}
