import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;

public class App {
    public static void main(String[] args) throws Exception {
        runHashSet();
        runLinkedHashSet();
        runTreeSet();
        runTreeSetConComparador();
        runEjercicio();
    }

    public static void runHashSet(){
        Sets sets = new Sets();
        Set<String> ejemploHashSet = sets.construirHashSet();
        System.out.println("----- HashSet ------");
        System.out.println("Elementos del HashSet (no se garantiza orden)");
        for (String elemento : ejemploHashSet){
            System.out.println(elemento);
        }
    }

    public static void runLinkedHashSet(){
        Sets sets = new Sets();
        Set<String> ejemploLinkedHashSet = sets.construirLinkedHashSet();
        System.out.println("----- LinkedHashSet ------");
        System.out.println("Elementos del LinkedHashSet (en orden de inserción)");
        for (String elemento : ejemploLinkedHashSet){
            System.out.println(elemento);
        }
    }

    public static void runTreeSet(){
        Sets sets = new Sets();
        Set<String> ejemploTreeSet = sets.construirTreeSet();
        System.out.println("----- TreeSet ------");
        System.out.println("Elementos del TreeSet (en orden alfabético)");
        for (String elemento : ejemploTreeSet){
            System.out.println(elemento);
        }
    }

    public static void runTreeSetConComparador(){
        Sets sets = new Sets();
        Set<String> ejemploTreeSetConComparador = sets.construirTreeSetConComparador();
        System.out.println("----- TreeSet Con Comparador ------");
        System.out.println("Elementos del TreeSetComparador (por longitud)");
        for (String elemento : ejemploTreeSetConComparador){
            System.out.println(elemento);
        }
    }


    private static void runEjercicio(){
        Set<Contacto> agenda = new TreeSet<>(new ContactoComparator());
        System.out.println("----- Ejercicio ------");

        agenda.add(new Contacto("Pedro", "Lopez", "222222222"));
        agenda.add(new Contacto("Luis", "Perez", "111111111"));
        agenda.add(new Contacto("Ana", "Perez", "987654321"));
        agenda.add(new Contacto("Pedro", "Lopez", "123456789"));

        for (Contacto c : agenda){
            System.out.println(c);
        }
        
        /* 
        Contacto c1 = new Contacto("Pedro", "López", "123456789");
        Contacto c2 = new Contacto("Pedro", "López", "123456789");
        System.out.println(c1);
        System.out.println(c2);

        System.out.println("*Referencia en memoria*");
        boolean comparacionReferencia = c1 == c2;
        System.out.println(comparacionReferencia);
        System.out.println("c1: " + c1 + " == c2: " + c2 + " = " + comparacionReferencia);

        System.out.println("*Comparacion con equals*");
        System.out.println(c1.equals(c2));
        boolean comparacionEquals = c1.equals(c2);
        System.out.println(comparacionEquals);
        System.out.println("c1: " + c1 + " == c2: " + c2 + " = " + comparacionEquals);

        System.out.println("*Comparación HashCode*");
        boolean comparacionHashCode = c1.hashCode() == c2.hashCode();
        System.out.println(comparacionHashCode);
        System.out.println("c1: " + c1.hashCode() + " == c2: " + c2.hashCode() + " = " + comparacionHashCode);
        */

    }     
}
