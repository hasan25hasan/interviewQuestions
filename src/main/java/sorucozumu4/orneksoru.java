package sorucozumu4;

import java.util.Scanner;

public class orneksoru {

    /*
       Question-1:(ENG)Write the code that checks whether the integer number entered is an Amostrong number.
       Armstrong number: The sum of the cubes of any 3-digit number,
       If it gives that number, the number is said to be an Armstrong number.

       (TR) Girilen tam sayının Armstrong sayısı olup olmadığını kontrol eden kodu yazınız.
       Armstrong sayi: Herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami,
       o sayiyi veriyorsa sayiya Armstrong sayidir denir.

            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370 */



    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz");
        int sayı=Math.abs(scan.nextInt());
        int sayı1=sayı/100;
        int sayı2=(sayı/10)%10;
        int sayı3=sayı%10;

        double result=Math.pow(sayı1,3) + Math.pow(sayı2,3)+ Math.pow(sayı3,3);




        if (sayı<100 && sayı>999 ) {
            System.out.println("Lütfen 3 basamaklı sayı giriniz");

        } else if (sayı==result) {
            System.out.println("Armstrong sayıdır");

        }else{
            System.out.println("Armstrong sayı degildir");
        }



    }
}
