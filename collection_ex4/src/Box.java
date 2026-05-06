public class Box <T>{
    private T valore;

    public Box(T valore) {
        this.valore = valore;
    }

    public T getValore(){
        return this.valore; 
    }

    public void setValore(T valore) {
        this.valore = valore;
    }
    
}
