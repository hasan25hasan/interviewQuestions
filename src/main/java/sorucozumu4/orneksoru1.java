package sorucozumu4;

import java.util.Scanner;

public class orneksoru1 {
    /*
    Question-2: (ENG)  Write a program that shows whether each integer is an armstrong number from 1 to the entered number.
            (TR)   Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
    gösteren program yazınız.
 */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen  bir tam  sayı giriniz");
        int sayı=Math.abs(scan.nextInt());
        int sum=0;
        int temp=sayı;

        while (temp>0){
            int digit=temp % 10;
            sum  +=digit * digit *digit;
            temp /=10;

        }
        if (sum==sayı){
            System.out.println("Armstrong sayısıdır");

        }else {
            System.out.println("bir Armstrong sayısı değildir");
        }



    }
}
