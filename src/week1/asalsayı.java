package src.week1;

public class asalsayı {

        public static void main(String[] args) {
            int toplamAsalSayi = 0;
            for (int i = 3; i <= 100; i++) {
                boolean asalSayiKontrol = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        asalSayiKontrol = false;
                        break;

                    }
                }
                if (asalSayiKontrol) {
                    toplamAsalSayi = toplamAsalSayi + i;
                }
            }
            System.out.println(toplamAsalSayi);
        }
    }

