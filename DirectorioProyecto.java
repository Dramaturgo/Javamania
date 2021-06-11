

//Obtener la ruta del directorio del proyecto actual con System.getProperty().

public class DirectorioProyecto {

    public static void main(String[] args) {
        
        String rutaProyecto = System.getProperty("user.dir");
        
        System.out.println(rutaProyecto);
    }
}
