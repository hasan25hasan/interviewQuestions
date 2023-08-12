package sorucozumu1;

import java.util.ArrayList;
import java.util.Scanner;

public class sorucozumu10072023 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
      task- kullanıcının cinsiyeti kadın ise 60 yasında
      büyük ve prim günü 6000den fazla ise emekliliği
      kullanıcı erkek ise 65 yasından büyük ve prim günü 7000den
      fazla ise emekliliğini kontrol edip kalan yıl ve prim
      gününü print eden code create ediniz
       */

      /*  Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi giriniz");
        String cinsiyet = scan.nextLine().toLowerCase();

        System.out.println("Lütfen yaşınızı giriniz");
        int yas = Math.abs(scan.nextInt());

        if (cinsiyet.equals("kadın")) {
            if (yas > 60) {
                System.out.println("Lütfen prim gününüzü giriniz");
                int primgunu = scan.nextInt();
                if (primgunu > 6000) {
                    System.out.println("EYT'ye takılmadın, oylar AKP'ye!");
                } else {
                    System.out.println("Eşek gibi çalışmaya devam, ekonomi çok iyi!");
                }
            } else {
                System.out.println("Emekli olma şartlarını sağlamıyorsunuz.");
            }
        } else if (cinsiyet.equals("erkek")) {
            if (yas > 65) {
                System.out.println("Lütfen prim gününüzü giriniz");
                int primgunuerkek = scan.nextInt();
                if (primgunuerkek > 7000) {
                    System.out.println("EYT'ye takılmadın, oylar AKP'ye!");
                } else {
                    System.out.println("Eşek gibi çalışmaya devam, ekonomi çok iyi!");
                }
            } else {
                System.out.println("Emekli olma şartlarını sağlamıyorsunuz.");
            }
        } else {
            System.out.println("Geçersiz cinsiyet girişi.");
        }
    }*/







        /*
        task- girilen 2 sayıyı seçilen 4 işlemden birini
        uygulayıp sonucu print eden code create ediniz
         */
        /*Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        double sayi1=Math.abs(scan.nextDouble());
        System.out.println("Lutfen ikinci sayiyi giriniz");
        double sayi2=Math.abs(scan.nextDouble());
        System.out.println("+ icin: 1 seciniz \n* icin: 2 seciniz, \n- icin: 3 seciniz, \n/ icin: 4 seciniz");

        int secim=scan.nextInt();
        if (secim==1) {
            System.out.println(sayi1+sayi2);

        } else if (secim==2) {
            System.out.println(sayi1*sayi2);

        } else if (secim==3) {
            System.out.println(sayi1-sayi2);

        } else if (secim==4) {
            System.out.println(sayi1/sayi2);

        }else{
            System.out.println("Lutfen gecerli bir secim giriniz");
        }*/











        /* task- girilen karakterin harf olup olmadığını kontrol eden code creeate ediniz */
      /*  System.out.println("Lütfen bir karakter giriniz gereksiz karakter olmasın");
        char character=scan.nextLine().charAt(0);
        if (character>='A' && character<='z' )  {
            System.out.println("Bu bir harfdir");

        }else {
            System.out.println("Bu bir harf degidir adam ol akıllı ol");
        }
*/








/*  Task Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */

       /* System.out.println("Lütfen bir tam sayi giriniz");
        int sayı=Math.abs(scan.nextInt());

        int toplam=0;
        for (int i = 1; i <sayı ; i++) {
            toplam=(i*i)+toplam;

        }
        System.out.println(" toplam " +toplam);*/


        //  TASK 100'den 0'a kadar bütün tek sayıları yazdırınız. 99-98-97-96.... 100 ve 0 dahil değildir.

       /* for (int i =99 ; i >0 ; i--) {
            if (i%2!=0){
                System.out.println(i+" ");
            }


        }*/

       /* TASK 100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
        Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin istenen sonuc : 91 78 65 52 39 26 13
*/
       /* int toplam=0;
        for (int i = 100; i >0 ; i--) {
            if (i%13==0){
              toplam+=i;
                System.out.println(i+" ");
            }

        }
        System.out.println(toplam);*/




      /*
 Girilen bir tam  sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
 girilen sayı dahil(tek ise), tek olanlarin adet yazdiralim
*/
     /*   System.out.println("Lütfen bir tam sayi giriniz");
        int sayı3= Math.abs(scan.nextInt());
        int counter=0;
        while (Math.abs(sayı3)>0){
            if (sayı3%2!=0){
                System.out.println(sayı3);
                counter++;

            }sayı3--;

        }
        System.out.println(counter);*/


//task->girilen bir metinde harf rakam ve özel karakter sayısını print eden kodu yazınız
        //Bu değişkenler, metindeki harf, sayı ve özel karakterlerin sayılarını tutar.

       /* System.out.println("Lütfen bir metin giriniz");
        String meto = scan.nextLine().replaceAll(" ","");
        int counterHarf = 0;
        int counterSayi = 0;
        int counterOk = 0;
        int index = 0;
        do {
            if (meto.charAt(index) >= '0' && meto.charAt(index) <= '9') {
                counterSayi++;

            } else if (meto.toLowerCase().charAt(index)>='a'&& meto.toLowerCase().charAt(index)<='z') {
                counterHarf++;


            }else counterOk++;
            index++;



        }while (index<meto.length());
            System.out.println(counterOk);
            System.out.println(counterHarf);
            System.out.println(counterSayi);*/

        //girilen bir String'deki rakam sayısını hesaplayan method yazınız

        /*System.out.println("Lütfen bir metin giriniz");
        String meto2=scan.nextLine().replaceAll(" ","");
        int rakam1=0;

        for (int i = 0; i <meto2.length() ; i++) {
            if(meto2.charAt(i)>='0' && meto2.charAt(i)<='9'){
                rakam1++;


            }


        }System.out.println(rakam1);*/



        }










    }















// Task-> girilen int değeri tersten print eden code create ediniz.









