package B.proyectojson;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramaPrincipal {
    // Se le ha llamado 'ProgramaPrincipal' para evitar confusión con el main de las hojas anteriores del mismo pdf.
    public static void main(String[] args) {
        // Imprime los argumentos si es que se ha puesto "debug" como el primer argumento
        if (args.length > 0 && args[0].equals("debug")) {
            imprimirArgs(args);
        }

        // AHORA SE PROCEDE CON LA SIGUIENTE ESTRUCTURA:
        // 1. DETECTAR CUÁLES SON LOS PARÁMETROS, ES DECIR, OPERACIÓN, Y FICHERO Y SI HAN SIDO INTRODUCIDOS
        if (args.length < 2) {
            System.out.println("Uso: java -jar programa.jar <operacion> <fichero>");
            return;
        }

        // 2. SE ESTABLECEN LOS PARÁMETROS NECESARIOS
        String operacion = args[0]; // Operación a realizar
        String fichero = args[1];   // Ruta del fichero con el que va a trabajar

        // 3. EN FUNCIÓN DE QUE SI OPERACIÓN ES 'INIT' O 'SHOW', REALIZAR UNA OPERACIÓN U OTRA (CREAR O MOSTRAR EL JSON..., HAY QUE IMPLEMENTARLO PARA QUE FUNCIONE CON OTROS TIPOS DE CLASES)
        if (operacion.equalsIgnoreCase("init")) {
            System.out.println("Inicializando fichero: " + fichero);
            init(fichero);
        }
        else if (operacion.equalsIgnoreCase("show")) {
            System.out.println("Mostrando fichero: " + fichero);
            show(fichero);
        }
        else {
            System.out.println("Operación no válida");
        }
    }

    public static void imprimirArgs(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            sb.append("Argumento ").append(i).append(": ").append(args[i]).append("\n");
        }
        System.out.println("Argumentos:\n" + sb);
    }

    public static void init(String fichero) {
        Alumno alumno = new Alumno();
        guardarObjetoEnArchivo(fichero, alumno);
    }

    public static void show(String rutaArchivo) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            Alumno alumno = (Alumno) gson.fromJson(reader, Alumno.class);
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("ID: " + alumno.getIdentificador());
            System.out.println("Media: " + alumno.getMedia());
            System.out.println("Edad: " + alumno.getEdad());
            System.out.println("Asignatura: " + alumno.getAsignatura());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
