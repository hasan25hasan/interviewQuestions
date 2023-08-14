package sorucozumu6;

import java.util.Scanner;

public class orneksoru1 {
   /*
    (ENG)Crteate a program checks if a String is PALINDROME or not.
         If a word, phrase, or sequence that reads the same backword as forward then it is called "palindrome",
         For Example : "madam" or "nursesrun" .

    (TR) Kulanıcının girdiği bir  String'in PALINDROME olup olmadığını kontrol eden bir method create ediniz.
         Polindrome : Tersten okunuşu da aynı olan ifadelerdir.
         Example : Ey edip Adanada pide ye,  Traş niçin şart
 */
       
        
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        String metin= scan.nextLine();
        if (polindrome(metin)){
            System.out.println("Bu kelime bir polindromdur");

        }else{
            System.out.println("Bu kelime polindrom degildir");
        }


      


    }
    public static boolean polindrome(String metin){
        StringBuilder tersoku=new StringBuilder(metin);
        tersoku.reverse();
        return metin.equalsIgnoreCase(tersoku.toString());
    }

}
