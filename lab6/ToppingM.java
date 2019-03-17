public class ToppingM implements Component {

    protected String description ;

    public ToppingM(String d )
    {
        description = d ;
    }


	public void printDescription() {
        System.out.println( "      ->|"+description  );
    }

	public void addChild(Component c) {        
	}
	 

	 
}