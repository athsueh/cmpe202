public class Topping implements Component {

    protected String description ;
    
    public Topping ( String d )
    {
        description = d ;
    }


	public void printDescription() {
        System.out.println( "      "+description  );
    }

	public void addChild(Component c) {        
	}
	 

	 
}