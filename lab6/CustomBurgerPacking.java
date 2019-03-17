import java.text.DecimalFormat;

public class CustomBurgerPacking extends Composite
{

    public CustomBurgerPacking(String d )
    {
        super(d) ;
    }
    public int count = 1;

    
    public void printDescription() {
        System.out.println( count+"      " + description + "                          ");

        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
}
