import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Esercizio 1");

        List<Person> people = new ArrayList<Person>(
            List.of(
                new Person("Enis", "Morisi", 22),
                new Person("Dante", "Alighieri", 56),
                new Person("Gojo", "Satoru", 26),
                new Person("Hinata", "Hyuga", 35),
                new Person("Aomine", "Daiki", 20)
            )
        );

        // Iterator<Person> itPer = people.iterator();
        // while(itPer.hasNext()){
        //     Person person = itPer.next();
        //     System.out.println(person.getName() + " " + person.getSurname());
        // }

        List<Person> filteredPeople = new LinkedList<Person>();

        Iterator<Person> itPer = people.iterator();
        while(itPer.hasNext()){
            Person person = itPer.next();

            if(person.getAge() > 30){
                filteredPeople.add(person);    
            }
        }

        for(Person person : filteredPeople){
            System.out.println(person.getName());
        }
    }
}
