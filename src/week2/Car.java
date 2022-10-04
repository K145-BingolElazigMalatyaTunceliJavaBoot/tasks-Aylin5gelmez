package src.week2;

public abstract class Car {
    private int luggage;
    private int dailyRental;
    private String color;
    private int age;

    public String getColor(){
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public int getAge()
    {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLuggage() {
        return luggage;
    }

    public void setLuggage(int luggage) {
        this.luggage = luggage;
    }

    public int getDailyRental() {
        return dailyRental;
    }

    public void setDailyRental(int dailyRental) {
        this.dailyRental = dailyRental;
    }
}

