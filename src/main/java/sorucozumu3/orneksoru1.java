package sorucozumu3;

import java.util.Scanner;

public class orneksoru1 {
    /*
        (ENG) Get a sentence and a letter from the user,
              * How many times the letter in the sentence find used and print.

        (TR)  Kullanicidan bir cumle ve bir harf alin,
              * Cumlede harfin kac kere kullanildigini bulup, yazdirin.

               EXAMPLE:
               INPUT : Sentence: It's great to learn Java. letter :e
               OUTPUT : The letter "e" is used 3 times in the sentence you entered.
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cumleyi giriniz.");
        String str = scan.nextLine();

        System.out.println("Harf giriniz.");
        char ch = scan.next().charAt(0);

        int counter=0;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)==ch){
                counter++;
            }


        }

        System.out.println(ch+" harfinden "+counter+" adet vardir.");



    }
}
