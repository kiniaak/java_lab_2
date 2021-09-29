import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */

        int lastDigit = 1;


        for (int i = 0; i <= 100; i++) {

            if (i % lastDigit == 0) {

                System.out.println("Liczba podzielna przez ostatnią cyfrę mojego indeksu:" + i);
            }
        }




        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        int[] tab = new int[5];
        Scanner scan = new Scanner(System.in);
         int n=0;
        for (int num : tab) {
            System.out.println("Podaj liczbę");
            n = scan.nextInt();
            tab[num] = tab[num] + n + 11;
            System.out.println(tab[num]);
        }

    }
}