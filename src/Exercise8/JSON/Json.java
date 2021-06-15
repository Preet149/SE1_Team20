package Exercise8.JSON;


import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.json.JSONArray;
import org.json.JSONObject;

public class Json {

    public static void main(String[]args){

        JSONArray array1=new JSONArray();

        array1.put(2);
        array1.put(7);
        array1.put(9);
        array1.put(4);

        JSONArray array2=new JSONArray();

        array2.put(12);
        array2.put(74);
        array2.put(99);
        array2.put(40);

        JSONObject obj=new JSONObject();

        obj.put("Array1",array1);
        obj.put("Array2",array2);



        JSONObject sumvalues=sum(obj);

        System.out.println(sumvalues.get("sum1"));
        System.out.println(sumvalues.get("sum2"));
    }

    public static JSONObject sum(JSONObject obj){

           int count=1;
           int summe=0;

           JSONObject temp=new JSONObject();

           while(obj.has("Array"+count)){

               for(Object i:obj.getJSONArray("Array"+count)){

                   summe+=(Integer)i;
               }

               temp.put("sum"+count,summe);
               summe=0;
               count++;

           }

        return temp;

    }
}
