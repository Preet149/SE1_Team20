package Exercise10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Befehlspeicherer befehl;
    Calculator calc;

    IBefehl undo;
    IBefehl redo;

    @BeforeEach
    @DisplayName("Creates objects of type Befehlspeicher, Calculator, UndoBefehl und RedoBefehl.")
    void setUp() {

        befehl=new Befehlspeicherer();
        calc=new Calculator();

        undo=new UndoBefehl(calc);
        redo=new RedoBefehl(calc);



    }

    @Test
    @DisplayName("Checks whether the calculations are done correctly.")
    void calculation() throws IllegalArgumentException {

        assertEquals(2,calc.calculation('+',2));
        assertEquals(10,calc.calculation('*',5));
        assertEquals(15,calc.calculation('+',5));
        assertEquals(5,calc.calculation('/',3));

    }

    @Test
    @DisplayName("Checks whether the redo method works properly.")
    void redoTest() throws IllegalArgumentException {

        assertEquals(2,calc.calculation('+',2));
        assertEquals(10,calc.calculation('*',5));
        assertEquals(15,calc.calculation('+',5));
        assertEquals(5,calc.calculation('/',3));

        befehl.speichereBefehl(undo);

        assertEquals( 15 ,befehl.aktiviere());
        assertEquals( 10 ,befehl.aktiviere());
        assertEquals( 2 ,befehl.aktiviere());
        assertEquals( 0 ,befehl.aktiviere());

        befehl.speichereBefehl(redo);

        assertEquals( 2 ,befehl.aktiviere());
        assertEquals( 10 ,befehl.aktiviere());
        assertEquals( 15 ,befehl.aktiviere());
        assertEquals( 5 ,befehl.aktiviere());

    }

    @Test
    @DisplayName("Checks whether the undo method works properly.")
    void undoTest() throws IllegalArgumentException {

        assertEquals(2,calc.calculation('+',2));
        assertEquals(10,calc.calculation('*',5));
        assertEquals(15,calc.calculation('+',5));
        assertEquals(5,calc.calculation('/',3));

        befehl.speichereBefehl(undo);

        assertEquals( 15 ,befehl.aktiviere());
        assertEquals( 10 ,befehl.aktiviere());
        assertEquals( 2 ,befehl.aktiviere());
        assertEquals( 0 ,befehl.aktiviere());


    }

    @Test
    @DisplayName("Checks whether an Exception is thrown by giving a wrong operand.")
    void exceptionTest(){

        assertThrows(IllegalArgumentException.class,()->calc.calculation('%',3));
    }


}