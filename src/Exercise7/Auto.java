package Exercise7;

public class Auto {



    //default constructor
    public Auto(){

    }

    //Returns true wenn this method is called.
    public boolean hatTurbo(){

        return true;
    }

    //Returns a Kunde Object
    public Kunde kunde(){

        return new Kunde();

    }

    //Gibt die Parkdauer zurück.
    public int parkdauer(){

        return 30;
    }
}
