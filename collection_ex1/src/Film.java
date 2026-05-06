public class Film {
    private String title;
    private String director;
    private int length;

    public Film(String title, String director, int length) {
        this.title = title;
        this.director = director;
        this.length = length;
    }

    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if(obj==null || this.getClass() != obj.getClass() ) return false;

        Film film = (Film)obj;
        return film.director==this.director || film.title==this.title || film.length==this.length;

    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

    
}
