package Exercise10;

public class UndoBefehl implements IBefehl{

    private Calculator calc;

    public UndoBefehl(Calculator obj){

        this.calc=obj;
    }

    public int fuehreAus(){

        return calc.undo();
    }


}
