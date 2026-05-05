import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Lista di persone salvate
        List<Person> people = new ArrayList<>(
            List.of(
                new Person("Gianni", "Morandi",80),
                new Person("Alvaro", "Soler",55),
                new Person("Pinco", "Pallino",15),
                new Person("Ermanno", "Ermanni",80),
                new Person("Leopoldo", "Favorevole",67),
                new Person("Gino", "Piccini",10),
                new Person("Gazef", "Stronof",40),
                new Person("Ainz", "Ooal Gown",300)
            )
        );

        // Richiesta all'utente riguardo alla persona da modificare
        System.out.println("Quale delle seguenti persone vuoi modificare?");

        // Elenco di persone disponibili da modificare
        Iterator<Person> itPer = people.iterator();
        while(itPer.hasNext()){
            Person person = itPer.next();
            System.out.print(person.getName() + ", ");
        }
        // Manda a capo
        System.out.println("");

        // Apriamo lo scanner 
        Scanner sc = new Scanner(System.in);

        // Prendiamo la prima parola che l'utente inserisce
        String name = sc.nextLine();

        //
        int index = -1;

        for(int i=0;i<people.size();i++){
            if(people.get(i).getName().equalsIgnoreCase(name)){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("Mi spiace, " + name + " non e' presente nella lista");
            sc.close();
            return;
        }
        
        // Messaggio di guida
        System.out.println("Perfetto, inserisci in ordine, separati da uno spazio bianco, i seguenti dati: name surname age");

        // Salviamo i dati dell'utente
        String userData = sc.nextLine();
        String[] userDataArray = userData.split(" ");

        if(userDataArray.length != 3){
            System.out.println("Errore! Devi inserire esattamente 3 valori");
            sc.close();
            return;
        }

        String newName = userDataArray[0];
        String newSurname = userDataArray[1];
        String newAgeString = userDataArray[2];
        int newAge = Integer.parseInt(newAgeString);

        // Aggiorniamo l'oggetto
        people.set(index, new Person(newName, newSurname, newAge ));
        
        System.out.println("Persona aggiornata con successo");


        sc.close();

        // Questo per controllare che la List sia stata aggiornata 
        // for(Person person : people){
        //     System.out.print(person.getName() + ", ");
        // }
    }
}
