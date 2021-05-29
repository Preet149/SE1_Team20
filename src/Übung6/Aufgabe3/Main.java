package Übung6.Aufgabe3;

public class Main {

    public static void main(String[]args){

       // System.out.println(Pattern.matches("(\\bHerr\\b|\\bFrau\\b)","HerrHerr"));

        Person p=new Person("Frau Dr. Eva Müller, Hochschule Bonn-Rhein-Sieg, Fachbereich Informatik, Grantham-Allee 20, 53757 Sankt Augustin");

        System.out.println(p.anrede);
    }
}
