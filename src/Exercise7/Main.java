package Exercise7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){

        Auto a1=new Auto();

        a1.hatTurbo();
        a1.kunde().isFirma();

        Auto a2=new Auto();

        a1.hatTurbo();
        a1.kunde().isFirma();

        List<Auto>auto= Arrays.asList(a1,a2);

    }
}
