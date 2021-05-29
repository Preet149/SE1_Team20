package Übung6.Aufgabe3;

import java.util.regex.Pattern;

public class Person{

    public String anrede;
    public String titel;
    public String vorname;
    public String nachname;
    public String organisation;
    public String abteilung;
    public String straße;
    public String hausnummer;
    public String plz;
    public String stadt;

    public Person(String input) {

        String temp = ""; //Zwischenspeicher
        int count=1;

        //Läuft durch den ganzen komplett String durch.
        for (int i = 0; i < input.length(); i++) {

            temp += input.charAt(i);

            if(count==1 && Pattern.matches("(\\bHerr\\b|\\bFrau\\b)",temp)){

                count++;

                this.anrede=temp;
            }
            else if(count==2 && Pattern.matches("([a-zA-Z\\.]{3,})",temp)){

                count++;

                this.titel=temp;
            }
            else if(count==3 && Pattern.matches("([a-zA-Z]{3,})",temp)){

                count++;

                this.vorname=temp;
            }
            else if(count==4 && Pattern.matches("[a-zA-ZÜÄÖüöä]{3,}",temp)) {

                count++;

                this.nachname = temp;
            }

        }
    }
}