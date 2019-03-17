import java.text.DecimalFormat;

public class Fries extends Composite
{

    public Fries(String d )
    {
        super(d) ;
    }
    public double price = 2.79;
    public int count = 1;

    
    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( count+"   " + description + "                        " + fmt.format( price ));

        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
}
