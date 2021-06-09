package Exercise8;

import java.util.*;

public class ZahlenListe implements DatastructurIF{

    int index=0;
    List<Integer>zahlen=Arrays.asList();

    @Override
    public IteratorIF geradezahligeIterator() {

        return new EvenIterator(zahlen);
    }

    @Override
    public IteratorIF ungeradezahligeIterator() {
        return new OddIterator(zahlen);
    }

    public void print(int value){

        System.out.println(value+" ");
    }


}
