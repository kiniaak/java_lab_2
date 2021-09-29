public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
        for (int i = 0; i <30 ; i++) {
            if (i == 20)
                break;
            System.out.println("i=" + i);
        }

        for (int i = 0; i <20 ; i++) {
            if(i%2==0)
                continue;
            System.out.println("i="+ i);
        }
        for (int i = 0; i < 50; i++) {
            if(i==30)
                return;
            System.out.println("i="+i);
            
        }
        
    }
}
