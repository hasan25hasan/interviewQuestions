package sorucozumu6;

import java.util.Scanner;

public class orneksoru {
    /*
(ENG)Create a function that takes an array and the difference between the largest and the smallest numbers.
     Ask user to enter array elements.
(TR)Kullanıcının girdigi bir array'in en buyuk elemani ile en kucuk elemanının  farkını bulan bir method create ediniz.
 */


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen gireceginiz dizinin elaman sayısını  giriniz");
        int dizi= scan.nextInt();
        int [] array=new int[dizi];
        for (int i = 0; i< dizi; i++) {

            System.out.println("Dizinin " + (i + 1) +  " .elemanını giriniz: ");
            array[i] = scan.nextInt();


        }
        int method=arraydizi(array);
        System.out.println("Dizideki en büyük ve  kücük elemanların farkı " +method);



    }



    public static int arraydizi(int[]array) {
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max=array[i];

            }if (array[i]<min){
                min=array[i];

            }

        }

      return max-min;
    }

}
