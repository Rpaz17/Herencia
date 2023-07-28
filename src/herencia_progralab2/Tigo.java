/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia_progralab2;

/**
 *
 * @author Gabriela Mejía
 */
import java.util.ArrayList;

public class Tigo {
    private ArrayList<Plan> planes;

    public Tigo() {
        planes = new ArrayList<>();
    }

    public void agregarPlan(int numeroTel, String nombre, String extra, String tipo) {
        if (busqueda(numeroTel, extra, tipo)) {
            System.out.println("El numero de telefono ya existe. Dato ya registrado.");
            return;
        }
        if (tipo.equals("IPHONE")) {
            planes.add(new PlanIPhone(numeroTel, nombre, extra));
        } else if (tipo.equals("SAMSUNG")) {
            planes.add(new PlanSamsung(numeroTel, nombre, extra));
        } else {
            System.out.println("Tipo de plan no valido.");
        }
    }

    public boolean busqueda(int numeroTel, String datoExtra, String tipo) {
        for (Plan plan : planes) {
            if (plan.getNumeroTelefono() == numeroTel) {
                return true;
            }
            if (tipo.equals("IPHONE") && plan instanceof PlanIPhone) {
                PlanIPhone planIPhone = (PlanIPhone) plan;
                if (planIPhone.getEmail().equals(datoExtra)) {
                    return true;
                }
            } else if (tipo.equals("SAMSUNG") && plan instanceof PlanSamsung) {
                PlanSamsung planSamsung = (PlanSamsung) plan;
                if (planSamsung.getPin().equals(datoExtra)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public double pagoPlan(int numeroTel, int mins, int msgs) {
        for (Plan plan : planes) {
            if (plan.getNumeroTelefono() == numeroTel) {
                return plan.pagoMensual(mins, msgs);
            }
        }
        System.out.println("El numero de telefono no existe.");
        return 0.0;
    }

    public void agregarAmigo(int numeroTel, String pin) {
        for (Plan plan : planes) {
            if (plan.getNumeroTelefono() == numeroTel && plan instanceof PlanSamsung) {
                PlanSamsung planSamsung = (PlanSamsung) plan;
                planSamsung.agregarPinAmigo(pin);
                return;
            }
        }
        System.out.println("El numero de telefono no existe o el plan no es de tipo SAMSUNG.");
    }

    public String lista() {
        int countSamsung=0;
        int countIPhone=0;
        
        for (Plan plan : planes) {
            plan.imprimir();
            System.out.println("Pago Mensual: $" + plan.pagoMensual(100, 50));
            System.out.println();

            if (plan instanceof PlanSamsung) {
                countSamsung++;
            } else if (plan instanceof PlanIPhone) {
                countIPhone++;
            }
        }
        return "Total de planes Samsung: "+countSamsung+"\nTotal de planes IPhone: "+countIPhone;
 
    }

}
