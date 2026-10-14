/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class ProfesorCatedra extends Profesor {

    private double auxilioTransporte;
    public ProfesorCatedra(double auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }
        public double getAuxilioTransporte() {
        return auxilioTransporte;
    }

    public void setAuxilioTransporte(double auxilioTransporte) {
        this.auxilioTransporte = auxilioTransporte;
    }
        @Override
    public double calcularPagoMensual(int horas) {
        return super.calcularPagoMensual(horas) + auxilioTransporte;
    }
        @Override
    public String toString() {
        return super.toString()
                + " | Tipo: Cátedra"
                + " | Auxilio de transporte: " + auxilioTransporte;
    }
}