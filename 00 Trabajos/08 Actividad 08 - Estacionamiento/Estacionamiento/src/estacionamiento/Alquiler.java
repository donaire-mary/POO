
package estacionamiento;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Marisol
 */
public class Alquiler {
    private LocalTime horaEntrada;
    private LocalTime horaSalida;
    private boolean pagado;
    private Vehiculo vehiculo;
    private Isla isla;

    public Alquiler(LocalTime entrada, Vehiculo auto, Isla laAsignada) {
        this.vehiculo=vehiculo;
    }

    public Alquiler(LocalTime horaEntrada, LocalTime horaSalida, boolean pagado, Vehiculo vehiculo, Isla isla) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.pagado = pagado;
        this.vehiculo = vehiculo;
        this.isla = isla;
    }
    

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public boolean isPagado() {
        return pagado;
    }

    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Isla getIsla() {
        return isla;
    }

    public void setIsla(Isla isla) {
        this.isla = isla;
    }

    float calcularSaldo() {
   if(horaEntrada==null || horaSalida==null){
       return 0.0f;}
   //
   long minutos=ChronoUnit.MINUTES.between(horaSalida, horaSalida);
   float HsTotal= minutos / 60.0f; 
   return HsTotal * vehiculo.getTarifa();}

    void registrarPago() {
    this.pagado=true;
            }

    void registrarSalida(LocalTime salida) {
   this.horaSalida=salida;
    }
    
    
}
