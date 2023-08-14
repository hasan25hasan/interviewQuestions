package sorucozumu5;

import java.util.Scanner;

public class orneksoru1 {
    /*
      (ENG) Write a method that finds whether the numbers up to one by the user are perfect or not.
      Perfect number: A number is perfect if the sum of its divisors, excluding itself, is equal to itself.
                      1+2+3 = 6 = 6 (Perfect)

      (TR) Kullanici tarafindan bir sayiya kadar olan sayilarin, mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : Bir sayinin kendisi haric bolenlerinin toplami, kendisine esitse o sayi mukemmeldir.
                      1+2+3 = 6 = 6 (Mukemmel)
      EX         :  (6, 28, 496, 8128)
      INPUT      :  6
      OUTPUT     :  1,2,3
 */
    public static boolean mukemmelSayi (int sayi){


        int sum = 1 ;
        for (int i = 2; i < sayi ; i++) {

            if (sayi % i == 0){
                sum += i;
            }

        }

        return sum == sayi;

    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (mukemmelSayi(i)){
                System.out.println(i + "mukemmel sayidir");
            }



        }
    }
}
