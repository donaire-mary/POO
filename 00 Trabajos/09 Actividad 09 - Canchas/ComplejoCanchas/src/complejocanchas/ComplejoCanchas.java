package ComplejoCanchas;
import complejocanchas.Cancha;
import complejocanchas.Cliente;
import complejocanchas.ICobrable;
import complejocanchas.Turno;
import java.time.LocalTime;

/**
 * @author Profe
 */
public class ComplejoCanchas implements ICobrable {
    
    @Override
    public void cobrarTurno(Turno t) {
        System.out.println("====== PAGO ADELANTADO (AUTORIZADO) ======");
        System.out.println("Responsable: " + t.getCliente().getNombre());
        System.out.println("Cancha: Nro " + t.getCancha().getNumero());
        System.out.println("Horario reservado: de " + t.getHoraS().minusMinutes((long)(t.calcularCosto()/t.getCancha().getTarifa()*60))+ "a" + t.getHoraS());
        System.out.println("Total pagado: $" + t.calcularCosto());
        System.out.println("==========================================");
    }

    public static void main(String[] args) {
        ComplejoCanchas complejo = new ComplejoCanchas();
        
        Cancha canchaTechada = new Cancha(3, 8000.0f);
        Cliente responsable = new Cliente("Marcos Paz");

        Turno turnoF5 = new Turno(LocalTime.of(20, 0), LocalTime.of(22, 0), canchaTechada, responsable);

        complejo.cobrarTurno(turnoF5);//se cobra antes de jugar
    }    

    
}