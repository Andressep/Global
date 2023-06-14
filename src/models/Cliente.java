package models;

public class Cliente {
    private int id;
    private String nombre;
    private String rut;
    private String direccion;
    private String telefono;
    private String correo_electronico;

    public Cliente(int id, String nombre, String rut, String direccion, String telefono, String correo_electronico) {
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo_electronico = correo_electronico;
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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo_electronico='" + correo_electronico + '\'' +
                '}';
    }
}
