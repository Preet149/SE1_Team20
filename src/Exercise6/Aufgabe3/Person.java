package Exercise6.Aufgabe3;

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

        String[]strings=input.split(",");

       //string[0] "Frau Dr. Eva Müller"

        String[]substrings1=strings[0].split(" ");

        this.anrede=(Pattern.matches("(\\bFrau\\b|\\bHerr\\b)",substrings1[0]))? substrings1[0]: null;
        this.titel=(Pattern.matches("[a-zA-Z.]{3,}",substrings1[1]))? substrings1[1]: null;
        this.vorname=(Pattern.matches("[a-zA-ZÜÄÖüöä]{3,}",substrings1[2]))? substrings1[2]: null;
        this.nachname=(Pattern.matches("[a-zA-ZÜÄÖüöä]{5,}",substrings1[3]))? substrings1[3]: null;

        //strings[1] "Hochschule Bonn-Rhein-Sieg"

        strings[1]=strings[1].substring(1);

        this.organisation=(Pattern.matches("([a-zA-Z\\-\s]{3,})",strings[1]))?strings[1]: null;

        //strings[2] "Fachbereich Informatik"

        strings[2]=strings[2].substring(1);

        this.abteilung=(Pattern.matches("([a-zA-Z\\-\s]+)",strings[1]))?strings[2]: null;

        //strings[2] "Grantham-Allee 20"

        strings[3]=strings[3].substring(1);

        String[] temp=strings[3].split(" "); //Strasse und Hausnummer separat abspeichern
        String hausnr="";
        String strasse="";

        for(int i=0;i<temp.length;i++){

            if(i+1== temp.length){

                hausnr=temp[i];
            }
            else{

                strasse+=temp[i]+" ";
            }
        }

        this.straße=(Pattern.matches("([a-zA-Z\\-\s]+)",strasse.substring(0,strasse.length()-1)))?strasse.substring(0,strasse.length()-1): null;
        this.hausnummer=(Pattern.matches("([0-9]+)",hausnr))?hausnr: null;

        //string[4] "53757 Sankt Augustin"

        String temp_plz="";
        String temp_stadt="";

        strings[4]=strings[4].substring(1);

        String[]temp1=strings[4].split(" ");

        for(int i=0;i<temp1.length;i++){

            if(i==0){

                temp_plz=temp1[i];
            }
            else{

                temp_stadt+=temp1[i]+" ";
            }
        }

        temp_stadt=temp_stadt.substring(0,temp_stadt.length()-1);

        this.plz=(Pattern.matches("([0-9]{5})",temp_plz))?temp_plz: null;
        this.stadt=(Pattern.matches("([a-zA-Z\\s]{4,})",temp_stadt))?temp_stadt: null;

        }
    }
