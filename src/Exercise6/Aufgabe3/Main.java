package Exercise6.Aufgabe3;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[]args){

       // System.out.println(Pattern.matches("(\\bHerr\\b|\\bFrau\\b)","HerrHerr"));

        Person p=new Person("Frau Prof. Peter Müller, Hochschule Bonn-Rhein-Sieg, Fachbereich Informatik, Grantham-Allee 20, 53757 Sankt Augustin");


        System.out.println(p.plz);
        System.out.println(p.stadt);

        String s="ssdsd ";

        System.out.println(s.substring(0,s.length()-1));

    }
}
