
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

//Formatear una fecha con el uso de la clase SimpleDateFormat.

public class FechaFormateada {

    public static void main(String[] args) {
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss.SSS");
        
        sdf.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT-5")));
        
        String formatoFechaHora = sdf.format(System.currentTimeMillis());
        
        System.out.println(formatoFechaHora);
    }
}
