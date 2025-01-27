package models;

public class Contacto {
    String nombre;
    String apellido;
    String telefono;
    
    public Contacto(String nombre, String apellido, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getTelefono() {
        return telefono;
    }
    
    @Override
    public String toString() {
        return nombre + " " + apellido + " - " + telefono;
    }

    @Override
    public int hashCode() {
        // Por simplicidad, combinamos los hash de nombre y apellido
        return nombre.hashCode() + apellido.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) // referencias de memoria
            return true;
        if (obj == null) 
            return false;
        if (getClass() != obj.getClass())
            return false;

        Contacto other = (Contacto) obj;
        return nombre.equals(other.nombre)
                && apellido.equals(other.apellido);
    }
}
