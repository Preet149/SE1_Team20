package Exercise10;

public class RedoBefehl implements IBefehl{

    private Calculator calc;

    public RedoBefehl(Calculator obj){

        this.calc=obj;
    }

    @Override
    public int fuehreAus() {

        return calc.redo();
    }
}
