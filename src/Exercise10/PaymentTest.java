package Exercise10;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    Payment pay;

    @BeforeEach
    void setUp() throws IllegalArgumentException {

        pay=new Payment(1234567890,"DE23583740274539474847",12345678);
    }

    @Test
    @DisplayName("Testet ob die Instanzvariable richtig abgespeichert wurde.")
    void testconstructor(){

        assertEquals(1234567890,pay.kontonummer);
        assertEquals("DE23583740274539474847",pay.iban);
        assertEquals(12345678,pay.blz);

    }
}