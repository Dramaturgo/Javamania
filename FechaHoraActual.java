//Usar la función currentTimeMillis() para obtener la fecha y hora actuales.

public class FechaHoraActual {

    public static void main(String[] args) {
        
        long horaFechaActuales = System.currentTimeMillis();
        
        System.out.println("Fecha y hora actuales: " + horaFechaActuales);
        
        System.out.println();
        
        System.out.format("Fecha y hora actuales: %tc\n", horaFechaActuales);
    }
}
