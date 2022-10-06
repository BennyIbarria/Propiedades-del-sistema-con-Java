import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class EdicionDepropiedadesDeSistema {
    public static void main(String[] args) {
        try {
            FileInputStream nuevoArchivo=new FileInputStream("src/EdicionPropiedadesDelSistema");
            Properties p = new Properties(System.getProperties());
            p.load(nuevoArchivo);
            System.setProperties(p);
            System.getProperties().list(System.out);
        } catch (Exception e) {
            System.out.println("No Existe el archivo: " + e);
        }

    }
}
