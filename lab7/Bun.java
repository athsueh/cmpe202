public class Bun extends LeafDecorator
{
    private String[] options ;


    public Bun(String d )
    {
        super(d) ;
    }
    
    // premium cheese +1.50
    public void setOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {
            if ( "Gluten-Free Bun".equals(options[i]) ) this.price += 1.00 ;
            if ( "Hawaiian Bun".equals(options[i]) ) this.price += 1.00 ;
            if ( "Pretzel Bun".equals(options[i]) ) this.price += 0.50 ;
        }
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
    
}