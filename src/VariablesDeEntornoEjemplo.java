import java.util.Map;

public class VariablesDeEntornoEjemplo {
    public static void main(String[] args) {
        //Guardamos elementos de cualquier tipo en un Map, en este caso las variables de ambiente
        Map<String, String> varEnv = System.getenv();
        System.out.println("variable de entorno del sistema: " + varEnv);

        //Imprimir todas las variables de ambiente con un for each
        for(String key: varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }

        //Imprimir las variables de ambiente de forma individual
        String username = System.getenv("USERNAME");
        System.out.println("Nombre de usuario: " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("Java Home: " + javaHome);

        String temp = System.getenv("TEMP");
        System.out.println("Directorio temporal: " + temp);

        String path = System.getenv("PATH");
        System.out.println("PATH: " + path);
    }

}
