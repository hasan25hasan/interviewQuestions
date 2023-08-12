package sorucozumu2;

import org.w3c.dom.css.Counter;

import java.util.Scanner;

public class orneksoru {
    public static void main(String[] args) {


/*
    (ENG)Get a String from the user.
    Print the number of each character in the String to the screen.

    (TR)Kullanicidan bir String aliniz.
    String'de var olan her character'in sayisini ekrana yazdiriniz.

    Example: alacan ==> a = 3, l = 1, c = 1, n = 1
             abaa ==> a = 3, b=1
 */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir String giriniz: ");
        String str = scanner.nextLine();


        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            // Tekrar sayısını bulmasi için iç içe geçmiş bir döngü kullanıyoruz
            for (int j = 0; j < str.length(); j++) {
                if (currentChar == str.charAt(j)) {
                    count++;
                }
            }

            // Her karakterin tekrar sayısını sadece bir kez yazdırmak için kontrol ediyoruz
            if (count > 0) {
                System.out.println(currentChar + " = " + count);
            }

            // Karakterin zaten sayısını bulduğumuz için bir daha hesaplamamak için bu karakteri işlemden çıkarıyoruz
            str = str.replace("" + currentChar, "");
            i = -1; // Döngü tekrar başa dönecek ve 0 indisli karakter ile devam edecek
        }


























    }
}