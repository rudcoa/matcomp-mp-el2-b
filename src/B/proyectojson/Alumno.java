package B.proyectojson;

public class Alumno {
    // Datos de la clase Alumno
    private String nombre;
    private int identificador;
    private double media;
    private int edad;
    private String asignatura;

    // Constructor por defecto de la clase Alumno
    public Alumno() {
        this.nombre = "Alumno";
        this.identificador = 0;
        this.media = 0.0;
        this.edad = 18;
        this.asignatura = "Metodología de la Programación";
    }

    // Constructor de la clase Alumno
    public Alumno(String nombre, int identificador, double media, int edad, String asignatura) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.media = media;
        this.edad = edad;
        this.asignatura = asignatura;
    }

    // Getter del parámetro 'nombre'
    public String getNombre() {
        return nombre;
    }

    // Setter del parámetro 'nombre'
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter del parámetro 'identificador'
    public int getIdentificador() {
        return identificador;
    }

    // Setter del parámetro 'identificador'
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    // Getter del parámetro 'media'
    public double getMedia() {
        return media;
    }

    // Setter del parámetro 'media'
    public void setMedia(double media) {
        this.media = media;
    }

    // Getter del parámetro 'edad'
    public int getEdad() {
        return edad;
    }

    // Setter del parámetro 'edad'
        public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter del parámetro 'asignatura'
    public String getAsignatura() {
        return asignatura;
    }

    // Setter del parámetro 'asignatura'
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
}
