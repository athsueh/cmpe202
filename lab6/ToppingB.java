public class ToppingB implements Component {

    protected String description ;

    public ToppingB(String d )
    {
        description = d ;
    }


	public void printDescription() {
        System.out.println( "      "+description );
    }

	public void addChild(Component c) {        
	}
	 

	 
}