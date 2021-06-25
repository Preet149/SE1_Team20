package Exercise10;

public class CreditCardBefehl implements IBefehl{

    private Payment obj;

    public CreditCardBefehl(Payment obj){

        this.obj=obj;
    }

    @Override
    public int fuehreAus() {

        return 0; // Noch zu Bearbeiten.
    }
}
