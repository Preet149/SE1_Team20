package Exercise8;

import java.util.Arrays;
import java.util.List;

public class TestClient {

    private static ZahlenListe digits;

    static{

        //Eine Liste von Zahlen erzeugen.
        List<Integer>zahlen= Arrays.asList();

        //Zahlen zur Liste hinzufuegen.

        zahlen.add(1);
        zahlen.add(2);
        zahlen.add(3);
        zahlen.add(4);
        zahlen.add(5);
        zahlen.add(6);
        zahlen.add(7);
        zahlen.add(8);

    }

    public static void main(String[]args){

        IteratorIF iter= digits.geradezahligeIterator();



        while(iter.hasnext()){

            int elem=iter.next();

            new ZahlenListe().print(elem);
        }

    }
}
