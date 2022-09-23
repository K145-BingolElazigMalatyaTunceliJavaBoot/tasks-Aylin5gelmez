package src.week1;
import java.util.Random;

public class puanlama {

    public static void main(String[] args) {
        Random random = new Random ();
        int randomSayi= random.nextInt(100);

        if(randomSayi >= 0 && randomSayi < 35){
            System.out.println("FF");
        }
        else if(randomSayi >=35 && randomSayi < 50){
            System.out.println("DC");
        }
        else if(randomSayi>=50 && randomSayi < 70){
            System.out.println("BB");
        }
        else if(randomSayi >= 70 && randomSayi <= 100){
            System.out.println("AA");
        }
    }
}

