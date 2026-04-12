package B.es.uah.matcomp.mp.el2.b;

public class Persona {
    // Atributos privados de la clase Persona
    private String nombre;
    private int edad;

    // Creamos dos constructores, el de por defecto...
    public Persona() {
        this.nombre = "John Doe";
        this.edad = 18;
    }

    // Y al que se le pasan parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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
}
