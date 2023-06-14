package models;

public class Proveedor {
    private int id;
    private String nombre;
    private String direccionPlanta;

    public Proveedor(int id, String nombre, String direccionPlanta) {
        this.id = id;
        this.nombre = nombre;
        this.direccionPlanta = direccionPlanta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionPlanta() {
        return direccionPlanta;
    }

    public void setDireccionPlanta(String direccionPlanta) {
        this.direccionPlanta = direccionPlanta;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccionPlanta='" + direccionPlanta + '\'' +
                '}';
    }
}
