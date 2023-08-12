package sorucozumu3;

import java.util.Scanner;

public class orneksoru {
    /*
    (ENG)   Write a code that checks your "PIN" code as a String. Block more than 3 wrong entries.
    (TR)    String olan "PIN" kodunuzu kontrol eden bir kod yazınız. 3'den fazla yanlis girislerde bloke koyunuz.
 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pin = "1905";//pin
        int check=0;//kontrol sayisi 0 dan baslamli ki


        while (check<3){
            System.out.println("Lutfen PIN giriniz.");
            String pinCode = sc.nextLine();

            if (pinCode.equals(pin)){
                System.out.println("Sifre dogru!");
                break;
            }else {
                check++;
                System.out.println("Tekrar deneyiniz: ");
            }

        }//while
        if (check==3){
            System.out.println("Hesap bloke oldu.");
        }




    }

}
