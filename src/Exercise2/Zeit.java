package Exercise2;

//author: Inderprit Singh

public class Zeit implements ZeitIF {

    @Override
    //Calculates minutes in hours
    public String Calculatemininhours(int minutes)throws IllegalargumentException {

        if(minutes<=60)
        {
            throw new IllegalargumentException("The value should be above 60!!");
        }

        int rest=minutes;
        int hours=0;


        while(rest>60)
        {
            hours=rest/60;
            rest=rest%60;

        }

        return hours+" hours and "+rest+" minutes";
    }

    @Override
    //Calculates hours in minutes
    //The parameter should be given like this 12:30.
    public int Calculatehoursinmin(String hours) {

        String h="", min="";
        boolean b=false;
        int temp1,temp2;


        for(int i=0;i<hours.length();i++)
        {
            if(hours.charAt(i)!=':')
            {
                if(b==false)
                {
                    h+=hours.charAt(i);
                }
                else
                {
                    min+=hours.charAt(i);
                }

            }
            else
            {
                b=true;
            }

        }


        return Integer.parseInt(h)*60+Integer.parseInt(min);

    }


}
