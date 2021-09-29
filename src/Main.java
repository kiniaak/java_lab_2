import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */
        Scanner scan=new Scanner(System.in);
        System.out.println("Podaj numer indeksu");
        int indeks=scan.nextInt();

            for (int i = 0; i <= 100; i++) {

                if ((i % (indeks % 10)) == 0) {

                    System.out.println("Liczba podzielna przez ostatnią cyfrę mojego indeksu:" + i);
                } else if (indeks % 10 == 0) {

                    System.out.println("Liczba podzielna przez dwie ostatnie cyfry mojego indeksu:" + ((i % (indeks % 100)) == 0));
                }
            }
        }

        }

        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

    }

