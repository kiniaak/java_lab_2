import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */
        Scanner scan = new Scanner(System.in);
        List<String> zwierzeta = new ArrayList<>();
        zwierzeta.add("Kot");
        zwierzeta.add("Pies");
        zwierzeta.add("Kon");
        zwierzeta.add("Owca");
        zwierzeta.add("Lew");

        zwierzeta.remove(3);
        zwierzeta.remove(4);
        zwierzeta.add("Chomik");
        zwierzeta.add("Swinka morska");
        zwierzeta.add("Wąż");
        Wyswietlliste(zwierzeta);
    }

    public static void Wyswietlliste(List<String>zwierzeta) {
        for (String zwierze:zwierzeta
             ) {
            System.out.println(zwierze);

        }
        System.out.println(zwierzeta.size());

    }


}


        

         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */





