import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {

        Set<Film> films = new HashSet<>(
            Set.of(
                new Film("Il Padrino", "Coppola", 175),
                new Film("Schindler's List", "Spielberg", 195),
                new Film("Psyco", "Hitchcock", 109)/* , */
                // Decommentare i due film sotto per verificare il funzionamento

                // new Film("Il Padrino", "Coppola", 175),
                // new Film("Il Padrino", "Coppola", 175)
            )
        );

        Iterator<Film> filmIt = films.iterator();
        while(filmIt.hasNext()){
            Film film = filmIt.next();
            System.out.print(film.getTitle() + " - ");
        }
    }
}
