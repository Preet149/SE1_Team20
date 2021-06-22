package Exercise10;

public class Befehlspeicherer {

    IBefehl befehl;

    public void speichereBefehl(IBefehl befehl){

        this.befehl=befehl;
    }

    public int aktiviere(){

        return this.befehl.fuehreAus();
    }


}
