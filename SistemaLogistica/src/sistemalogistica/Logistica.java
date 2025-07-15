package sistemalogistica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Logistica {

    private List<Vehiculo> vehiculos = new ArrayList<>();

    public void mostrarVehiculos() {
        for (Vehiculo v : vehiculos) {
            System.out.println(v);
        }
    }

    public void agregarVehiculos(Vehiculo vehiculo) {
        for (Vehiculo v : vehiculos) {
            if (v.equals(vehiculo)) {
                System.out.println("Esta vehiculo ya existe");
                return;
            }
        }
        vehiculos.add(vehiculo);
        System.out.println("Vehiculo agregado con exito");
    }

    public void recorrer() {
        for (Vehiculo v : vehiculos) {
            if (v instanceof Recorrible) {
                ((Recorrible) v).iniciarRecorrido();
            } else {
                System.out.println("El vehiculo con patente '" + v.getPatente() + "' no puede iniciar exploracion, es un vehiculo de inspeccion.");
            }
        }

    }

    public void OrdenarPorFabricacion() {
        Collections.sort(vehiculos);
        System.out.println("Vehiculos ordenados por año de fabricacion");
        mostrarVehiculos();
    }

    public void OrdenarPorMarca() {
        Collections.sort(vehiculos, new ComparadorMarca());
        System.out.println("Vehiculos ordenados por marca");
        mostrarVehiculos();
    }
    
    
    
}
