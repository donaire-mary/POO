
package estacionamiento;

/**
 *
 * @author Marisol
 */
public class Vehiculo {
    private String tipo;
    private String color;
    private String marcaModelo;
    private String patente;
    private float tarifa;

    public Vehiculo() {
    }

    public Vehiculo(String tipo, String color, String marcaModelo, String patente, float tarifa) {
        this.tipo = tipo;
        this.color = color;
        this.marcaModelo = marcaModelo;
        this.patente = patente;
        this.tarifa = tarifa;
    }
    
    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public void setMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public float getTarifa() {
        return tarifa;
    }

    public void setTarifa(float tarifa) {
        this.tarifa = tarifa;
    }
    
}
