package sorucozumu2;

import java.util.Scanner;

public class orneksoru2 {
    /*
    (ENG)   Ask user enter a positive number and check if it is prime or not.
    (TR)    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin.
 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen pozitif bir tam sayı giriniz");
        int sayı = Math.abs(scan.nextInt());
        boolean asalsayı=true;

            for (int i = 2; i <=Math.sqrt(sayı) ; i++) {//2. bloğa i<=sayı/2 de yazılınca oluyor

                if (sayı%i==0){
                    asalsayı=false;
                    break;


                }

            }
            if(asalsayı){
                System.out.println(" sayı asaldır");
            }else{
                System.out.println( " asal degildir");

            }
        }






    }


