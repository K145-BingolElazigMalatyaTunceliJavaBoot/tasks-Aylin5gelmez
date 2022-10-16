package src.week3.airline.entities;

import java.util.List;

public abstract class Company {
    private String name;
    private List<String> seats;
    private int businessPrice;
    private int economicPrice;
    private boolean abroad;
    private boolean domestic;

    public void foodService() {
        if (abroad) {
            System.out.println("Yurt dışı yemek servisimiz vardır");
        } else {
            System.out.println("Yurt dışı yemek servisimiz yoktur");
        }
        if (domestic) {
            System.out.println("Yurt içi yemek servimiz vardır");
        } else {
            System.out.println("Yurt içi yemek servisimiz yoktur");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSeats() {
        return seats;
    }

    public void setSeats(List<String> seats) {
        this.seats = seats;
    }

    public int getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(int businessPrice) {
        this.businessPrice = businessPrice;
    }

    public int getEconomicPrice() {
        return economicPrice;
    }

    public void setEconomicPrice(int economicPrice) {
        this.economicPrice = economicPrice;
    }

    public boolean isAbroad() {
        return abroad;
    }

    public void setAbroad(boolean abroad) {
        this.abroad = abroad;
    }

    public boolean isDomestic() {
        return domestic;
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }
}




