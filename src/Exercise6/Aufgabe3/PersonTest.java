package Exercise6.Aufgabe3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1;
    String input=" \"Frau Dr. Eva Müller, Hochschule Bonn-Rhein-Sieg, Fachbereich Informatik, Grantham-Allee 20, 53757 Sankt Augustin";

    @BeforeEach
    @DisplayName("Creates a new Object for every testmethod.")
    void setUp() {

        p1=new Person(input);
    }

    @DisplayName("Tests each one of the instance variable.")
    void testcontructor(){

        assertEquals("Frau",p1.anrede,"");
        assertEquals("Dr.",p1.titel,"");
        assertEquals("Eva",p1.vorname,"");
        assertEquals("Müller",p1.nachname,"");
        assertEquals("Hochschule Bonn-Rhein-Sieg",p1.organisation,"");
        assertEquals("Fachbereich Informatik",p1.abteilung,"");
        assertEquals("Grantham-Allee",p1.straße,"");
        assertEquals("20",p1.hausnummer,"");
        assertEquals("Sankt Augustin",p1.stadt,"");
        assertEquals("53757",p1.plz,"");

    }
}