/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_progralab2;

/**
 *
 * @author Gabriela Mejía
 */

public abstract class Plan {
    private int numeroTelefono;
    private String nombreCliente;

    Plan(int numeroTelefono, String nombreCliente) {
        this.numeroTelefono = numeroTelefono;
        this.nombreCliente = nombreCliente;
    }

    int getNumeroTelefono() {
        return numeroTelefono;
    }

    String getNombreCliente() {
        return nombreCliente;
    }

    abstract double pagoMensual(int mins, int msgs);
    
    void imprimir() {
        System.out.println("Número de teléfono: " + numeroTelefono);
        System.out.println("Nombre del cliente: " + nombreCliente);
    }
}