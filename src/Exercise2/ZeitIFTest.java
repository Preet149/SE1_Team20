package Exercise2;

//author: Inderprit Singh

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ZeitIFTest {
	
	ZeitIF z;

	@BeforeEach
	@DisplayName("Creates a new Object for each test method.")
	void setUp() throws Exception {
		
		z=new Zeit();
	}

	@Test
	@DisplayName("Converts minutes in hours.")
	void testCalculatemininhour() throws IllegalargumentException {
		
		assertEquals("333 hours and 20 minutes",z.Calculatemininhours(20000));
		
	}

	@Test
	@DisplayName("Converts hours in minutes.")
	void testCalculatehourinmin() {
		
		assertEquals(20000,z.Calculatehoursinmin("333:20"));
		
	}
	
	@Test
	@DisplayName("Checks whether the method throws an Exception by giving a wrong value.")
	void exceptiontest()
	{
		assertThrows(IllegalargumentException.class,()->z.Calculatemininhours(60));
	}
	
	@AfterEach
	@DisplayName("Deletes an Object after each test method.")
	void tearDown() throws Exception {
		
		z=null;
	}

}
