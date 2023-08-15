package sorucozumu7;

import java.util.Scanner;

public class Orneksoru1 {
    /*
    (EN) Ask the user to enter a name and character, then check how many times the character is repeated.
    (TR) Kullanicidan bir isim ve karakter girmesini isteyin, sonra karakterin kac kez tekrarlandigini kontrol edin.
            char ch= 'e' ;
            String name ="Sevecen"
            => Counter = 3
            **COZULDU!!

*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz");
        String isim= scan.nextLine();

        System.out.println("Lütfen karakter giriniz");
        char karakter=scan.next().charAt(0);

        int sayaç=0;

        for (int i = 0; i < isim.length(); i++) {
            if (isim.toLowerCase().charAt(i)==karakter){

                sayaç++;

            }

        }
        System.out.println(karakter + " harfi " + sayaç + ". kez tekrar edilmistir");


    }
}
