public class Persona {

    private String nombre;
    private String apellido;
    private Persona siguiente;

    public Persona() {
        this.siguiente = null;
    }

    public Persona(String nombre, String apellido)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.siguiente = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Persona getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Persona siguiente) {
        this.siguiente = siguiente;
    }
    
}