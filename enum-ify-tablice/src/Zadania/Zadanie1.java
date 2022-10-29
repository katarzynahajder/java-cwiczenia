package Zadania;

public class Zadanie1 {
    public static void main(String[]args){
        Liczba(10);
        Liczba(6);
        Liczba(15);
    }
    public static void Liczba(int x){
        if(x%3==0&&x%5==0)System.out.println("foobar");
        else if(x%3==0)System.out.println("foo");
        else if(x%5==0)System.out.println("bar");
    }
}
