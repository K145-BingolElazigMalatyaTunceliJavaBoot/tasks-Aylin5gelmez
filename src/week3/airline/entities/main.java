package src.week3.airline.entities;

import src.week3.airline.entities.Pegasus;
import src.week3.airline.entities.Thy;

import java.util.List;

public class main {
    public static void main(String[] args) {
        Thy thy = new Thy();
        List<String> seatsThy = thy.getSeats();

        for (int i = 0; i < seatsThy.size(); i++) {
            if (i % 6 == 0) {
                System.out.println();
            }
            System.out.print(seatsThy.get(i) + " - ");
        }

        System.out.println("******************************************************************************************");

        Pegasus pegasus = new Pegasus();
        List<String> seatspegasus = pegasus.getSeats();

        for (int i = 0; i < seatspegasus.size(); i++) {
            if (i % 8 == 0) {
                System.out.println();
            }
            System.out.print(seatspegasus.get(i) + " - ");
        }


    }

}