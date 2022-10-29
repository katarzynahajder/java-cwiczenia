package Biblioteka;

public class Book{
    public String title;
    public Author author;
    public Genre genre;

    public Book(String t, Author a, Genre g){
        title=t;
        author=a;
        genre=g;
    }
    public String getInfo(){
        return title+" "+author.getInfo()+" "+genre;
    }
}
