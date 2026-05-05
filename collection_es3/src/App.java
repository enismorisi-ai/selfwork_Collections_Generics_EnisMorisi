import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Esercizio 3");

        // Creazione di una semplice lista di Stringhe 
        List<String> fruits = new ArrayList<String>();
        fruits.add("Mela"); 
        fruits.add("Pera"); 
        fruits.add("Banana"); 
        fruits.add("Mela"); 
        fruits.add("Mela"); 
        fruits.add("Banana"); 
        fruits.add("Pompelmo");
        

        // 1 MODO
        System.out.println("Elenco attuale con duplicati:");

        // Stampa dei singoli elementi 
        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }

        System.out.println("\nElenco senza duplicati:");

        // Converto la List in un Set, che per definizione non ammette duplicati
        // LinkedHashSet mantiene l'ordine di inserimento, mentre HashSet no
        // Set<String> set = new HashSet<>(fruits);
        Set<String> set = new LinkedHashSet<>(fruits);

        // Ritorno ad una list
        List<String> list = new ArrayList<>(set);

        
        for(String fruit : list){
            System.out.print(fruit + " ");
        }
        

        /*// 2 MODO 
        // Creo una nuova lista
        List<String> fruitsND = new ArrayList<>();

        // Ciclo sulla lista iniziale e per ciascun frutto confronto se si trova all'interno della nuova lista. Se non c'e' lo aggiungo
        for(int i=0;i<fruits.size();i++){
            // current fruit
            String fruit = fruits.get(i);

            if(!fruitsND.contains(fruit)){
                fruitsND.add(fruit);
            }
        }

        // Stampo i singoli elementi non duplicati 
        Iterator<String> itFruit = fruitsND.iterator();
        while(itFruit.hasNext()){
            String fruit = itFruit.next();
            System.out.print(fruit + " ");
        }
        */

    }
}
