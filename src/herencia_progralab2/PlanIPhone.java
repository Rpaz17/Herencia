package herencia_progralab2;

import java.util.ArrayList;

public class PlanIPhone extends Plan {
     private String email;
    public PlanIPhone(int numeroTelefono, String nombreCliente, String email){
        super(numeroTelefono, nombreCliente);
        this.email=email;
    }

    @Override
    double pagoMensual(int mins, int msgs) {
        double costoMinutos = 0.4*mins;
        double costoMensajes = 0.1*msgs;
       return (22+costoMinutos+costoMensajes);
    }
    
    void imprimir(){
        super.imprimir();
        System.out.println(email);
    }

    public String getEmail() {
        return email;
    }
}
