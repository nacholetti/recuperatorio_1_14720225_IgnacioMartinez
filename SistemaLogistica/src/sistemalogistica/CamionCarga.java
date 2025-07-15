package sistemalogistica;

public class CamionCarga extends Vehiculo implements Recorrible {

    private int capacidadCarga;
    private static final int CARGAMAX = 30;
    private static final int CARGAMIN = 1;

    public CamionCarga(int capacidadCarga, String patente, String marca, int anioFabricacion) {
        super(patente, marca, anioFabricacion);
        if (capacidadCarga < 1 ) {
            this.capacidadCarga = 1;
        } else if (capacidadCarga > 30) {
            this.capacidadCarga = 30;
        } else {
            this.capacidadCarga = capacidadCarga;
        }

    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    
    

    @Override
    public String toString() {
        return "CamionCarga" + "capacidadCarga:" + capacidadCarga  +  "  " +  super.toString();
    }

    @Override
    public void iniciarRecorrido() {
        System.out.println("Camion de carga iniciando recorrido...");
    }

}
