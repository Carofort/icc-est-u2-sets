package utils;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto>{
    @Override
     public int compare(Contacto c1, Contacto c2){
        int comparacionApellido = Integer.compare(Integer.valueOf(c1.getApellido()), Integer.valueOf(c2.getApellido()));
        int comparacionNombre = Integer.compare(Integer.valueOf(c1.getNombre()), Integer.valueOf(c2.getNombre()));
        if(comparacionApellido != 0 ){
            return comparacionApellido;
        } else if(comparacionNombre != 0){
            return comparacionNombre;
        }
        return comparacionNombre;

    }
}

