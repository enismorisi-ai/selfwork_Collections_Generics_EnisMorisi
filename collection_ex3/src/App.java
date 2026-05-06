import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class App {

    public static void stampaInfo(Map<String,Person> map){
        for(Map.Entry<String,Person> entry : map.entrySet()){
            String key = entry.getKey();
            System.out.println("Chiave: " + key);

            Person person = entry.getValue();
            System.out.println("Valori: " + person.getName() + " " + person.getSurname() + " " + person.getSex() + " " + person.getAge());
        }
    }

    public static void main(String[] args) throws Exception {

        SortedMap<String,Person> peopleMap = new TreeMap<>();

        peopleMap.put("enis", new Person("Enis", "Morisi", 'M', 22));
        peopleMap.put("luca", new Person("Luca", "Bozzali", 'M', 23));
        peopleMap.put("jennifer", new Person("Jennifer", "Aniston", 'F', 57));

        for(Map.Entry<String,Person> entry : peopleMap.entrySet()){
            // String key = entry.getKey();
            Person person = entry.getValue();
            System.out.println(person.getName() + " " + person.getSurname());
        }

        System.out.println("Inserisci nome, cognome, sesso e eta' della persona da aggiungere");
        System.out.println("[Scrivi i dati separati da una virgola in questo modo: nome,cognome,sesso,eta']");
        
        // Apro la scanner 
        Scanner sc = new Scanner(System.in);

        // raccolgo i dati dell utente
        String personData = sc.nextLine();
        
        String[] personDataArr = personData.split(",");

        if(personDataArr.length != 4){
            System.out.println("Dati non validi, devi inserire solo 4 valori");
            sc.close();
            return;
        }
        else{
            String name = personDataArr[0]; 
            String surname = personDataArr[1];
            // Per il sesso estraggo solo la prima lettera M = Maschio/Male, F = Femmina/Female
            char sex = personDataArr[2].toUpperCase().charAt(0); 
            int age = Integer.parseInt(personDataArr[3]); 

            // creo l'oggetto Person con i dati dell'utente
            Person newPerson = new Person(name,surname,sex,age);

            // aggiungo l'oggetto alla Map
            // come chiave voglio il nome della persona tutto in minuscolo
            peopleMap.put(name.toLowerCase(), newPerson);

            // mostro l'elenco delle persone presenti per vedere il corretto inserimento della nuova persona

            stampaInfo(peopleMap);
            // for(Map.Entry<String,Person> entry : peopleMap.entrySet()){
            //     String key = entry.getKey();
            //     System.out.println("Chiave: " + key);

            //     Person person = entry.getValue();
            //     System.out.println("Valori: " + person.getName() + " " + person.getSurname() + " " + person.getSex() + " " + person.getAge());
            // }



            // Rimuovo la persona appena aggiunta
            peopleMap.remove(name.toLowerCase());

            if(!peopleMap.containsKey(name)){
                System.out.println(name + " cancellato con successo");
            }
            
            // Cerco la persona rimossa
            System.out.println("Cercalo di nuovo");
            String checkName = sc.nextLine();

            if(!peopleMap.containsKey(checkName)){
                System.out.println("La persona in questione non e' nella lista");
            }
            else{
                System.out.println("Questa persona e' nella lista, ma non e' quella che hai appena aggiunto");
            }

        }

    }
}
