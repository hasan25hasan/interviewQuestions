package sorucozumu2;

import java.util.Scanner;

public class orneksoru1 {
    /*
    (ENG) Write a method that returns the first and last letter of a String received from the user
          as much as the number received from the user.
    (TR)  Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar return eden method yaziniz.
     *
     * Examp:  input            output
     *         elma  2           eaea
     *         army  3           ayayay
 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String mtn= scan.nextLine();

        System.out.println("lütfen bir tam sayı giriniz");
        int sayı= Math.abs(scan.nextInt());

        String sonuc=ilksonharf(mtn,sayı);
        System.out.println(sonuc);


    }
    private static String ilksonharf(String mtn,int sayı) {
        String str=mtn.substring(0,1)+mtn.substring(mtn.length()-1);
        String sonuc="";//sonucu koyacağımız bir boş konteynır
        for (int i = 1; i<=sayı ; i++) {
            sonuc+=str;


        }

        return sonuc;
    }
}
