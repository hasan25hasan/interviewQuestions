package sorucozumu1;

import java.util.Scanner;

public class assdd {

    public static void main(String[] args) {


        // Task-> girilen int değeri tersten print eden code create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int sayi= scan.nextInt();
        System.out.println("Tersten yazilmis hali");
        while (sayi!=0){
            int sayi1=sayi%10;
            System.out.print(sayi1);
            sayi /=10;

        }







    }
}
