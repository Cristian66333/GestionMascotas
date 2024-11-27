public class Persona{
    private String cedula;
    private String nombre;
    private String numeroTelefono;

    public Persona(String cedula, String nombre, String numeroTelefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    

}