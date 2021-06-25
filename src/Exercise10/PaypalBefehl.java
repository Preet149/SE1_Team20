package Exercise10;

public class PaypalBefehl implements IBefehl{

    private Payment obj;

    public PaypalBefehl(Payment obj){

        this.obj=obj;
    }

    @Override
    public int fuehreAus() {

        return 0;
    }
}
