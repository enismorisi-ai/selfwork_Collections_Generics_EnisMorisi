import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Map<String,Book> books = new HashMap<String,Book>();
        
        books.put("I Promessi Sposi", new Book("I Promessi Sposi", "Manzoni"));
        books.put("1984", new Book("1984", "Orwell"));
        books.put("La Coscienza di Zeno", new Book("La Coscienza di Zeno", "Svevo"));
        books.put("Il Signore degli Anelli", new Book("Il Signore degli Anelli", "Tolkien"));
        books.put("Il nome della rosa", new Book("Il nome della rosa", "Eco"));
        books.put("Orgoglio e Pregiudizio", new Book("Orgoglio e Pregiudizio", "Austen"));

        System.out.println("Elenco dei libri attualmente disponibili:");

        for(Map.Entry<String,Book> entry : books.entrySet()){
            String title = entry.getKey();
            System.out.println("- " + title);
        }

        System.out.println("Seleziona il libro che vuoi leggere");

        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();

        if(books.containsKey(title)){
            Book bookSearched = books.get(title);
            System.out.println("Ecco le informazione relative al libro cercato: ");
            System.out.println("Titolo: " + bookSearched.getTitle() + "\nAutore: " + bookSearched.getAuthor());
        }
        else{
            System.out.println("Mi spiace, il libro non e' disponibile");

        }

        sc.close();
    }
}
