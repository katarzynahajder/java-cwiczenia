package Zadania;
import java.util.Random;

public class Zadanie3{
    public static void main(String[]args){
        Random r=new Random();
        int[] tab=new int[5];
        for(int i=0; i<5; i++){
            tab[i]=r.nextInt();
            System.out.println(tab[i]);
        }
        int min=tab[0];
        for(int i=0; i<5; i++) {
            if(tab[i]<min)min=tab[i];
        }
        System.out.println("Najmniejsza liczba w tablicy: "+min);
    }
}
