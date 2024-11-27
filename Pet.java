public class Pet {
    private String id;
    private String raza;
    private String nombre;
    private int edad;
    private Persona owner;

    public Pet(String id, String raza, String nombre, int edad, Persona owner) {
        this.id= id;
        this.raza = raza;
        this.nombre = nombre;
        this.edad= edad;
        this.owner = owner;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona getOwner() {
        return owner;
    }

    public void setOwner(Persona owner) {
        this.owner = owner;
    }

    

}
