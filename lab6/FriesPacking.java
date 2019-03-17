import java.text.DecimalFormat;

public class FriesPacking extends Composite
{

    public FriesPacking(String d )
    {
        super(d) ;
    }
    public int count = 1;

    
    public void printDescription() {
        System.out.println( count+"    " + description + "                        " );

        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
}
