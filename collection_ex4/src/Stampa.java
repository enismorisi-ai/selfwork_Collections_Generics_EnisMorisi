public class Stampa{
    // un metodo puo' essere generico anche senza che l'intera classe lo sia

    public static <T> void stampa(T value){
        System.out.println(value);
    }
}