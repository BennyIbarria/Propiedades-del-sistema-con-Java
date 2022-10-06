import java.util.Properties;

public class SystemProperties {
    public static void main(String[] args) {

        //Creamos un objeto de tipo String y le asignamos el metodo de la clase System getPropertie
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        //Ruta del Home del usuario
        String rutaHome= System.getProperty("user.home");
        System.out.println("rutaHome = " + rutaHome);

        //Ruta del espacio de trabajo
        String workSpace = System.getProperty("user.dir");
        System.out.println("workSpace = " + workSpace);

        //Versión de java
        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);

        //Ver todas las propiedades del sistema
        Properties p = System.getProperties();
        p.list(System.out);
    }
}
