package src.week2;

public class SEDAN  extends Car{
        private int monthlyRentCar;

        public int getMonthlyRentCar()
        {
            return monthlyRentCar;
        }
        public void setMonthlyRentCar(int monthlyRentCar)
        {
            this.monthlyRentCar=monthlyRentCar;
        }
        public int SedanMonthlyRental()
        {
            int day=30;
            int pay=(300*day);
            return pay;

        }
        public void SedanDailyRental(){
            System.out.println("Günlük kiralama yaptınız.");
        }


    }
