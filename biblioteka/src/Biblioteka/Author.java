package Biblioteka;

public class Author {
    public String firstName;
    public String lastName;

    public Author(String f, String l){
        firstName=f;
        lastName=l;
    }
    public String getInfo(){
        return firstName+" "+lastName;
    }
}