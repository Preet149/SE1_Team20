package Exercise10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Befehlspeicherer befehl;
    Calculator calc;

    IBefehl undo;
    IBefehl redo;

    @BeforeEach
    void setUp() {

        befehl=new Befehlspeicherer();
        calc=new Calculator();

        undo=new UndoBefehl(calc);
        redo=new RedoBefehl(calc);



    }

    @Test
    void calculation() {

        assertEquals(2,calc.calculation('+',2));
        assertEquals(10,calc.calculation('*',5));
        assertEquals(15,calc.calculation('+',5));
        assertEquals(5,calc.calculation('/',3));

    }

    @Test
    void redoTest() {

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
    void undoTest() {

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
}