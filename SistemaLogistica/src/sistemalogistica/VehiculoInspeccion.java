

package sistemalogistica;


public class VehiculoInspeccion extends Vehiculo {
    private UsoAsignado usoAsignado;

    public VehiculoInspeccion(UsoAsignado usoAsignado, String patente, String marca, int anioFabricacion) {
        super(patente, marca, anioFabricacion);
        this.usoAsignado = usoAsignado;
    }

    @Override
    public String toString() {
        return "VehiculoInspeccion:" + "usoAsignado:" + usoAsignado + " " + super.toString();
    }

    
    
    
    
    
    
}
