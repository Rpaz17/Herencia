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
            System.out.println("Plan ya creado.");
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
       boolean numeroExiste = false;
       for (Plan plan : planes) {
           if (plan.getNumeroTelefono() == numeroTel) {
               numeroExiste = true;
               if (plan instanceof PlanSamsung) {
                   PlanSamsung planSamsung = (PlanSamsung) plan;
                   if (planSamsung.getPin().equals(pin)) {
                       planSamsung.agregarPinAmigo(pin);
                       System.out.println("Amigo agregado al BBM del plan Samsung.");
                       return;
                   } else {
                       System.out.println("El PIN ingresado no coincide con el registrado para este número.");
                       return;
                   }
               } else {
                   System.out.println("El plan asociado al número de teléfono no es de tipo SAMSUNG.");
                   return;
               }
           }
       }
       if (!numeroExiste) {
           System.out.println("El número de teléfono no existe.");
       }
   }

    public String lista() {
        int countSamsung = 0;
        int countIPhone = 0;
        String result = "";

        for (Plan plan : planes) {
            result += "Número de teléfono: " + plan.getNumeroTelefono() + "\n";
            result += "Nombre del cliente: " + plan.getNombreCliente() + "\n";

            if (plan instanceof PlanSamsung) {
                PlanSamsung planSamsung = (PlanSamsung) plan;
                result += "Tipo de plan: SAMSUNG" + "\n";
                result += "PIN: " + planSamsung.getPin() + "\n";

                // Display names and PINs of friends in BBM list
                ArrayList<String> bbm = planSamsung.getAmigosBBM();
                if (!bbm.isEmpty()) {
                    result += "\nAmigos en BBM:\n";
                    for (String amigo : bbm) {
                        result += amigo + "\n";
                    }
                }

                result += "Pago Mensual: $" + planSamsung.pagoMensual(0, 0) + "\n";
                result += "\n";
                countSamsung++;
            } else if (plan instanceof PlanIPhone) {
                PlanIPhone planIPhone = (PlanIPhone) plan;
                result += "Tipo de plan: IPHONE" + "\n";
                result += "Email: " + planIPhone.getEmail() + "\n";
                result += "Pago Mensual: $" + planIPhone.pagoMensual(0, 0) + "\n";
                result += "\n";
                countIPhone++;
            }
        }

        result += "Total de planes Samsung: " + countSamsung + "\n";
        result += "Total de planes IPhone: " + countIPhone;

        return result;
    }
}