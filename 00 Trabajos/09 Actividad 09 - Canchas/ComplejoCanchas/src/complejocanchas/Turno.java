/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
   */
package complejocanchas;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Marisol
 */
public class Turno {
    private LocalTime horaE;
    private LocalTime horaS;
    private Cancha cancha;
    private Cliente cliente;
    
    public float calcularCosto(){
         if(horaE==null || horaS==null){
         return 0.0f;
    }
        long minusMinutes=ChronoUnit.MINUTES.between(horaE, horaS);
        float horaFin= minusMinutes / 60.0f;
        return horaFin * cancha.getTarifa();
    }
    
    public Turno() {
    }

    public Turno(LocalTime horaE, LocalTime horaS, Cancha cancha, Cliente cliente) {
        this.horaE = horaE;
        this.horaS = horaS;
        this.cancha = cancha;
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    

    public LocalTime getHoraE() {
        return horaE;
    }

    public void setHoraE(LocalTime horaE) {
        this.horaE = horaE;
    }

    public LocalTime getHoraS() {
        return horaS;
    }

    public void setHoraS(LocalTime horaS) {
        this.horaS = horaS;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }
    

}
