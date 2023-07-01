package leksion5.Klasat;

public class Liber {
    private String title;
    private String author;
    private String ISBN;
    public Liber(){}
    public Liber(String title, String author, String ISBN){
        this.title=title;
        this.author=author;
        this.ISBN=ISBN;
    }
    public Liber(String title, String author){
        this.title=title;
        this.author=author;
    }
    public Liber(String ISBN){
        this.ISBN=ISBN;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setISBN(String isbn){
        this.ISBN=isbn;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getISBN() {
        return ISBN;
    }
}
