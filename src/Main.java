import java.util.Scanner;

public class Main {

    private static int[] tablica;

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */
           Scanner scan=new Scanner(System.in);
        System.out.println("Podaj liczbę");
           int num= scan.nextInt();
           switch(num%2){
               case 0:

                      System.out.println("Liczba jest parzysta");

                  break;

           }
        System.out.println("Podaj liczbę");
           int num1= scan.nextInt();
           switch(num1%7){
               case 0:
                   System.out.println("Liczba jest podzielna przez 7");

           }
        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */

    }
}
