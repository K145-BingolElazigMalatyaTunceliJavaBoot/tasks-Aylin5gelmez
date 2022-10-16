package src.week3.airline.entities;

import java.util.ArrayList;
import java.util.List;

public class Thy extends Company {
    public Thy() {
        setName("Türk Hava Yolları");
        setAbroad(true);
        setDomestic(true);
        setBusinessPrice(2500);
        setEconomicPrice(1250);
        makeSeats();
    }

    private void makeSeats() {
        List<String> seats = new ArrayList<String>();
        final String[] seatLetter = {"A", "B", "C", "D", "E", "F"};
        for (int i = 0; i < seatLetter.length; i++) {
            // 1A 1B 1C -- 1D 1E 1F
            // 2A 2B 2C -- 2D 2E 2F
            seats.add("1"+seatLetter[i]);
            seats.add("2"+seatLetter[i]);
        }
        // A1 B1 C1 -- D1 E1 F1
        for (int i = 1; i <= 30; i++) {
            for (int j = 0; j < seatLetter.length; j++) {
                seats.add(seatLetter[j] + "" + i);
            }
        }
        setSeats(seats);
    }

}

