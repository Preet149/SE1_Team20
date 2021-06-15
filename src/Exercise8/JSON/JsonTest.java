package Exercise8.JSON;

import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JsonTest {

    JSONArray array1;
    JSONArray array2;
    JSONObject obj;
    Integer[]values1={3,5,7,9};
    Integer[]values2={12,5,67,9};

    @BeforeEach
    @DisplayName("Creates new Objects of type JSONArray and JSONObject")
    void setUp() {

        array1=new JSONArray();

        for(Integer i:values1){

            array1.put(i);
        }

        array2=new JSONArray();

        for(Integer i:values2){

            array2.put(i);
        }

        obj=new JSONObject();

       obj.put("Array1",array1);
       obj.put("Array2",array2);

    }

    @Test
    @DisplayName("Testet die sum Methode.")
    void testsum() {

        assertEquals(24,Json.sum(obj).get("sum1"));
        assertEquals(93,Json.sum(obj).get("sum2"));

    }
}