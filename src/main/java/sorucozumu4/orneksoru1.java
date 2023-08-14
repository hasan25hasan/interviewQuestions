package sorucozumu4;

import java.util.Scanner;

public class orneksoru1 {
    /*
    Question-2: (ENG)  Write a program that shows whether each integer is an armstrong number from 1 to the entered number.
            (TR)   Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
    gösteren program yazınız.
 */

    public static void main(String[] args) {
        Scanner  scan=new Scanner(System.in);
        System.out.println("Lütfen 3 basamakli bir sayı giriniz");

        int num=Math.abs(scan.nextInt());

        if (num < 1 || num > 999) {
            System.out.println("Lütfen 1 ile 999 arasında bir sayı giriniz.");
        } else {
            System.out.println("Armstrong sayılar: ");
            for (int i = 1; i <= num; i++) {
                int originalNumber = i;
                int sum = 0;
                int numberOfDigits = 0; //Sayinin basamak sayisi

                int temp = i;
                while (temp > 0) {
                    temp /= 10;
                    numberOfDigits++;
                }

                temp = i;
                while (temp > 0) {
                    int digit = temp % 10;
                    sum += Math.pow(digit, numberOfDigits); // digit basamak sayisi ve 3 basamakli sayi olacagi icin
                    // sayinin 3.kuvvetini almis oluyor.
                    temp /= 10;
                }

                if (sum == originalNumber) {
                    System.out.print(i + " ");
                }
            }
        }
    }


}
