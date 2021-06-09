package Exercise8;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class OddIterator implements IteratorIF{

    int index=0;
    List<Integer> zahlen= Arrays.asList();

    public OddIterator(List<Integer>obj){

        this.zahlen=obj;

    }

    @Override
    public int next() {

        return (zahlen.get(index)%2==1)?zahlen.get(index++): zahlen.get(++index);
    }

    @Override
    public boolean hasnext() {

        return index<zahlen.size();
    }
}
