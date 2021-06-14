
//Obtener los datos básicos de la versión de Java instalada en el sistema operativo.

public class VersionJava {

    public static void main(String[] args) {
        
        System.out.println("Versión de java: " + System.getProperty("java.version"));
        System.out.println("Versión del JRE: " + System.getProperty("java.runtime.version"));
        System.out.println("Home de Java: " + System.getProperty("java.home"));
        System.out.println("Vendor de Java: " + System.getProperty("java.vendor"));
        System.out.println("URL del Vendor de Java: " + System.getProperty("java.vendor.url"));
        System.out.println("Path de clase Java: " + System.getProperty("java.class.path"));
    }
}
