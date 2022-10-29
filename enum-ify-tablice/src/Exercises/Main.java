package Exercises;

public class Main{
    public static void main(String[]args){
        czyParzysta(237);
    }

    public static boolean czyParzysta(int x){
        if(x%2==0){
            System.out.println("Podana liczba jest parzysta!");
            return true;
        }
        else{
            System.out.println("Podana liczba nie jest parzysta!");
            return false;
        }
    }
}