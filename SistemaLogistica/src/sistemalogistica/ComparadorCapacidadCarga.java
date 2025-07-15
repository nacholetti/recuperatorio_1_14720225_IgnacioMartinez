
package sistemalogistica;

import java.util.Comparator;


public class ComparadorCapacidadCarga implements Comparator<Vehiculo> {

  
    /*incompleto*/
    @Override
    public int compare(Vehiculo o1, Vehiculo o2) {
        if(o1.equals(o2))
        return Integer.compare(o2.getCantidadPasajeros(), o2.getCantidadPasajeros());// Descendente
    }
    
}
