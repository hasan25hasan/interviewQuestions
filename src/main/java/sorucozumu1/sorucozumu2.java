package sorucozumu1;

import java.util.ArrayList;

public class sorucozumu2 {

    public static void main(String[] args) {



        //task 3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden kodu yazınız

       int count = 0;
        System.out.println("3 basamaklı, 4 ve 6'ya tam bölünebilen sayılar:");
        for (int i = 999; i >= 100; i--) {
            if (i % 4 == 0 && i % 6 == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Toplam sayı adedi: " + count);


      /*  int counter = 0;
        int i;

        for (i=999; i > 99; i--){

            if (i % 4 == 0 || i % 6 == 0) {

                System.out.println(i);
                counter++;


            }

        }

        System.out.println("Toplam sayi adedi: " + i);*/


        }



    }
