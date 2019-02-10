
public class GumballMachine
{

    private int num_gumballs;
    private int has_quarter;
    private int machine_num;
    private int total_change;

    public GumballMachine( int size, int type )
    {
        // initialise instance variables
        this.num_gumballs = size;
        this.has_quarter = 0;
        this.machine_num = type;
        this.total_change = 0;
    }

    public void insertCoin(int coin)
    {
        if ( this.machine_num == 3 )
        {
            if ( coin == 1 || coin == 5 || coin == 10 || coin == 25 )
            {
                this.total_change += coin;
                System.out.println("Current total change: " + this.total_change);
            }
            else {
                System.out.println( "Please insert a valid coin." ) ;
            }
        }
        else if ( coin == 25 )
            this.has_quarter++ ;
        else {
            System.out.println( "Please insert a quarter." ) ;
        }
    }
    
    public void turnCrank()
    {
    	if ( this.has_quarter > 0 || this.total_change >= 50)
    	{
    		if ( this.num_gumballs > 0 )
    		{
                if ( this.machine_num == 3) {
                    System.out.println( "Thanks for your change.  Gumball Ejected!" );
                    this.num_gumballs-- ;
                    this.total_change -= 50;
                    return;
                }
    		    if ( this.machine_num == 2 && this.has_quarter == 1) {
                    System.out.println( "The crank will not turn with 1 quarter." ) ;
                    return;
                }
    			this.num_gumballs-- ;
    			this.has_quarter -- ;
                if ( this.machine_num == 2 )
                {
                    this.has_quarter -- ;
                    System.out.println( "Thanks for your 2 quarters.  Gumball Ejected!" ) ;
                }
    			else {
    			    System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
                }
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your change." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a coin" ) ;
    	}        
    }
}
