package Calendar;

public class App{
    public static void main(String[]args){
        System.out.println(jakiMiesiac(7));
        System.out.println(jakiMiesiac(13));
        System.out.println(jakiMiesiac(0));
    }

    public static Month jakiMiesiac(int x){
        if(x==1)return Month.STYCZEN;
        else if(x==2)return Month.LUTY;
        else if(x==3)return Month.MARZEC;
        else if(x==4)return Month.KWIECIEN;
        else if(x==5)return Month.MAJ;
        else if(x==6)return Month.CZERWIEC;
        else if(x==7)return Month.LIPIEC;
        else if(x==8)return Month.SIERPIEN;
        else if(x==9)return Month.WRZESIEN;
        else if(x==10)return Month.PAZDZIERNIK;
        else if(x==11)return Month.LISTOPAD;
        else if(x==12)return Month.GRUDZIEN;
        else return Month.UNKNOWN;
    }
}