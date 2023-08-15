package sorucozumu7;

import java.util.Scanner;

public class Orneksoru {

/*      (EN)Ask the user for numbers to be collected,
              1- If the number of numbers exceeds 10 or if the total exceeds 500, this number is sufficient,
              2- Print ".. you have entered a number of numbers, the sum is...".
              **RESOLVED!!

        (TR)Kullanicidan toplanmak uzere sayilar isteyin,
              1- Sayi adedi 10'u gecerse veya toplam 500 'u gecerse bu kadar sayi yeter,
              2- ".. adet sayi girdin, toplami..." yazdirin.
              **COZULDU!!
*/


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int toplam=0;
        int sayıadet=0;
       while (sayıadet<10 && toplam < 500){
           System.out.println("Lütfen bir sayı giriniz");
           int sayı= scan.nextInt();
           toplam +=sayı;
           sayıadet++;

       }
        System.out.println(sayıadet+ " adet sayı girdiniz: " + toplam);


    }


}
