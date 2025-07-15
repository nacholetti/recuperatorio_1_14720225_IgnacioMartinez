
package sistemalogistica;



public class Colectivo extends Vehiculo implements Recorrible{
    private int cantidadPasajeros;

    public Colectivo(int cantidadPasajeros, String patente, String marca, int anioFabricacion) {
        super(patente, marca, anioFabricacion);
        this.cantidadPasajeros = cantidadPasajeros;
    }

    @Override
    public String toString() {
        return "Colectivo:" + " cantidadPasajeros = " + cantidadPasajeros + " " +super.toString(); 
    }


   
    

    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    
    
    
    @Override
    public void iniciarRecorrido() {
        System.out.println("Colectivo iniciando recorrido...");
    }


    
    
    
}
