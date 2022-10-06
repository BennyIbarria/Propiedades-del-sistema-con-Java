import java.io.IOException;

public class EjecutarProgramaSO {
    public static void main(String[] args) {

        //Nos permite cargar aplicaciones con en metodo exec(execute)
        Runtime rt = Runtime.getRuntime();
        Process proceso;


        try {
            if(System.getProperty("os.name").toLowerCase().contains("windows")){
                proceso = rt.exec(("notepad"));
            }else if (System.getProperty("os.name").toLowerCase().contains("mac")){
                proceso = rt.exec("textedit");
            }else if(System.getProperty("os.name").toLowerCase().contains("nux")||
                System.getProperty("os.name").toLowerCase().contains("nix")){
                proceso = rt.exec("gedit");
            }else {
               proceso = rt.exec("gedit");
            }
            proceso.waitFor();
        } catch (Exception e) {
            System.err.println("Comando desconocido: " + e.getMessage());
            System.exit(1);
        }
        System.out.println("Se ha cerrado el editor de texto");
        System.exit(0);


    }
}
