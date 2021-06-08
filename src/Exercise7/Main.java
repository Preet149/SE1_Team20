package Exercise7;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[]args){

        Auto a1=new Auto();

        Auto a2=new Auto();

        Auto a3=new Auto();

        Auto a4=new Auto();

        Auto a5=new Auto();

        List<Auto> autos= Arrays.asList(a1,a2,a3,a4,a5);

        List<Auto> firmen= Arrays.asList();

        System.out.println(autos.stream().filter(x -> x.hatTurbo() && x.kunde().isFirma()).map(x -> x.parkdauer()* new ParkHaus().gebühr()).reduce(0,Integer::sum)+" Euro");

        System.out.println(autos.stream().filter(x -> x.parkdauer()>1440).map(x ->firmen.add(x) ));



    }
}
