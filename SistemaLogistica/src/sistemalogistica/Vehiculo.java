
package sistemalogistica;

import java.util.Objects;


public abstract class Vehiculo implements Comparable<Vehiculo>{
    private String patente;
    private String marca;
    private int anioFabricacion;

    public Vehiculo(String patente, String marca, int anioFabricacion) {
        this.patente = patente;
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return "Vehiculo: " + " patente: " + patente + ", marca:" + marca + ", anioFabricacion:" + anioFabricacion ;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.patente);
        hash = 43 * hash + Objects.hashCode(this.marca);
        hash = 43 * hash + this.anioFabricacion;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        if (this.anioFabricacion != other.anioFabricacion) {
            return false;
        }
        if (!Objects.equals(this.patente, other.patente)) {
            return false;
        }
        return Objects.equals(this.marca, other.marca);
    }

    @Override
    public int compareTo(Vehiculo o) {
        return o.getAnioFabricacion() - this.getAnioFabricacion();
                
    }
    
    

    
        
    
}
