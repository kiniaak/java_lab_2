public class Main {

    public static void main(String[] args) {

        /* cw.1 pętle while */

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indexu (podać nr indexu)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */
        int i = 1000;
        int indeks = 57071;
        int n = indeks % 100;
        System.out.println("\n");
        do {
            System.out.println(i);
            i--;
            if (i % n == 0)
                System.out.println("Liczba" + " " + i + " " + "podzielna przez" + " " + n);
        } while (i >= 0);

        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */
        int[] tab = new int[]{0, 3, 6, 87, 9};

        int j = 0;
        while (j < 5) {
            System.out.println("tab[j]:" + tab[j]);
            j++;
        }
        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */
        while (true) {
            System.out.println("Jesteśmy w domu");
        }

    }
    /*Przy pętli while(false)wystąpi błąd*/
}
