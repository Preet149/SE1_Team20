package Exercise10;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Befehlspeicherer befehl;
    Calculator calc;

    IBefehl undo;
    IBefehl redo;

    int total=0;

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
        assertEquals(6,calc.calculation('*',3));
        assertEquals(15,calc.calculation('+',5));
        assertEquals(5,calc.calculation('/',3));

    }

    @Test
    void redoTest() {

        befehl.speichereBefehl(redo);
        befehl.aktiviere();



    }

    @Test
    void undoTest() {

        befehl.speichereBefehl(redo);

        assertEquals(15,befehl.aktiviere());

    }
}