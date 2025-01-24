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

    /*
    private static runEjericio(){
        Set<Contacto> agenda = new TreeSet<>(ContactoComparator());

    } */      
}
