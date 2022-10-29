package Biblioteka;

public class App{
    public static void main(String[] args){
        Author autor1=new Author("Adam", "Mickiewicz");
        Author autor2=new Author("Bolesław", "Prus");
        Author autor3=new Author("Zofia", "Nałkowska");
        Book ksiazka1=new Book("W pustyni i w puszczy", autor1, Genre.Fantasy);
        Book ksiazka2=new Book("Lalka", autor2, Genre.Mystery);
        Book ksiazka3=new Book("Medaliony", autor3, Genre.Horror);
        System.out.println(ksiazka1.getInfo());
        System.out.println(ksiazka2.getInfo());
        System.out.println(ksiazka3.getInfo());
    }
}
