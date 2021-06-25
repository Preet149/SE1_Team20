package Exercise10;

import java.util.regex.Pattern;

public class Payment {

     long kontonummer;
     String iban;
     long blz;

    public Payment(int kontonummer,String iban,int blz)throws IllegalArgumentException{

        if(Pattern.matches("([0-9]{10})","kontonummer")){

             this.kontonummer=kontonummer;
        }
        else{

            throw new IllegalArgumentException();
        }

        if(Pattern.matches("([A-Z]{2}[0-9]{20})","iban")){

            this.iban=iban;
        }
        else{

            throw new IllegalArgumentException();
        }

        if(Pattern.matches("([0-9]{8})","blz")){

            this.blz=blz;
        }
        else{

            throw new IllegalArgumentException();
        }

    }


}
