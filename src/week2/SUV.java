package src.week2;

public class SUV extends Car {

    private int MonthlyRentalCar;
    public int getmonthlyRentalCar;


    public void setMonthlyRentalCar(int MonthlyRentalCar) {
        this.MonthlyRentalCar = MonthlyRentalCar;


    }

    public int SUVMonthlyRentalCar() {
        int age = 12;
        int day = 30;
        int paySUV = (age * 300 / 1000 + day * 300);
        return paySUV;

    }

    public void SUVDailyRental() {
        System.out.println("Günlük kiralama yaptınız");

    }
}