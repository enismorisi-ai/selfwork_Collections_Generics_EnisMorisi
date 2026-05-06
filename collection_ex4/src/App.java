public class App {
    public static void main(String[] args) throws Exception {
        
        Box<String> stringa = new Box<String>("stringa casuale bellissima");
        Box<Integer> intero = new Box<Integer>(12);
        Box<Double> decimale = new Box<Double>(23.90);

        System.out.println(stringa.getValore() + " e' di classe " + stringa.getValore().getClass().getSimpleName());
        System.out.println(intero.getValore() + " e' di classe " + intero.getValore().getClass().getSimpleName());
        System.out.println(decimale.getValore() + " e' di classe " + decimale.getValore().getClass().getSimpleName());

        
        char c = 'B';
        String ciao = "ciao";
        Integer numIntero = 160;
        Byte numByte = 100; 


        System.out.println("\nMetodo generico");

        Stampa.stampa(ciao + " e' di classe " + ciao.getClass().getSimpleName());
        Stampa.stampa(numIntero + " e' di classe " + numIntero.getClass().getSimpleName());
        Stampa.stampa(numByte + " e' di classe " + numByte.getClass().getSimpleName());
    }
}
