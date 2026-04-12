package B.es.uah.matcomp.mp.el2.b;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
// Al parecer esta clase por defecto de Java, no se usa en ningún momento, pero la dejo ahí de todos modos.
import java.lang.reflect.Type;


public class GsonUtilEjemploModificado {

    // Metodo para guardar un objeto en un archivo JSON
    public static <T> void guardarObjetoEnArchivo(String rutaArchivo, T objeto) {
        Gson gson = new Gson();
        try (FileWriter writer = new FileWriter(rutaArchivo)) {
            gson.toJson(objeto, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Metodo para cargar un objeto desde un archivo JSON
    public static <T> T cargarObjetoDesdeArchivo(String rutaArchivo, Class<T> clase) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader(rutaArchivo)) {
            return gson.fromJson(reader, clase);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // NUEVO METODO MAIN MODIFICADO SÓLO PARA QUE LEA LA INFORMACIÓN DE ESE ARCHIVO JSON ES DECIR, QUE LO CARGUE Y LO IMPRIMA POR PANTALLA, NO QUE LO GUARDE
    public static void main(String[] args) {
        // Ruta del archivo de donde se van a extraer o cargar los objetos
        String rutaArchivo = "usuario.json";
        // Cargar el objeto Usuario desde el archivo JSON
        Usuario usuarioCargado = cargarObjetoDesdeArchivo(rutaArchivo, Usuario.class);
        if (usuarioCargado != null) {
            System.out.println("Usuario cargado: " + usuarioCargado.nombre);
            System.out.println("Edad del usuario cargado: " + usuarioCargado.edad);
            System.out.println("Correo electrónico del usuario cargado: " + usuarioCargado.correo);
        }
    }

    // Clase Usuario para los ejemplos
    static class Usuario {
        // Parámetros de la clase usuario
        String nombre;
        int edad;
        String correo;

        // Constructor de la clase Usuario
        public Usuario(String nombre, int edad, String correo) {
            this.nombre = nombre;
            this.edad = edad;
            this.correo = correo;
        }

        // Getter del atributo 'nombre'
        public String getNombre() {
            return nombre;
        }

        // Setter del atributo 'nombre'
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        // Getter del atributo 'edad'
        public int getEdad() {
            return edad;
        }

        // Setter del atributo 'edad'
        public void setEdad(int edad) {
            this.edad = edad;
        }

        // Getter del atributo 'correo'
        public String getCorreo() {
            return correo;
        }

        // Setter del atributo 'correo'
        public void setCorreo(String correo) {
            this.correo = correo;
        }
    }
}
