/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_progralab2;

import java.util.ArrayList;

/**
 *
 * @author Gabriela Mejía
 */
class PlanSamsung extends Plan {
    private String pin;
    private ArrayList<String> bbm;

    PlanSamsung(int numeroTelefono, String nombreCliente, String pin){
        super(numeroTelefono, nombreCliente);
        this.pin=pin;
        bbm= new ArrayList();
    }

    @Override
    double pagoMensual(int mins, int msgs) {
        double costoMins = (mins > 200) ? 0.8 * (mins - 200) : 0;
        double costoMsgs = (msgs > 300) ? 0.2 * (msgs - 300) : 0;
        return 40.0 + costoMins + costoMsgs;
    }

    @Override
    void imprimir(){
        super.imprimir();
        System.out.println("PIN: "+pin);
    }
    
    void agregarPinAmigo(String pin) {
        if (!bbm.contains(pin)) {
            bbm.add(pin);
        }
    }
    
    String getPin(){
        return pin;
    }
}