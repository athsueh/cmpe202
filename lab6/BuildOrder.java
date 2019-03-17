public class BuildOrder {

    public static Component getOrder()
    {
        Composite myOrder = new Composite( "Order Number:   45");

        CustomBurger customBurger = new CustomBurger( "LBB" ) ;
        ToppingB bc = new ToppingB( "{{{{ BACON }}}}" );
        Topping l = new Topping("LETTUCE");
        Topping t = new Topping("TOMATO");
        ToppingM g = new ToppingM("G ONION");
        ToppingM j = new ToppingM("JALA Grilled");
        customBurger.addChild( bc );
        customBurger.addChild( l ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( g ) ;
        customBurger.addChild( j ) ;

        Fries f = new Fries("LTL CAJ");

        myOrder.addChild( customBurger );
        myOrder.addChild( f );
        return myOrder ;
    }

    public static Component getPacking()
    {
        Composite myOrder2 = new Composite( "Sandwich#  1");

        CustomBurgerPacking customBurger2 = new CustomBurgerPacking( "LBB" ) ;

        Topping l = new Topping("LETTUCE");
        Topping t = new Topping("TOMATO");
        ToppingM g = new ToppingM("G ONION");
        ToppingM j = new ToppingM("JALA Grilled");
        ToppingB bc = new ToppingB( "{{{{ BACON }}}}" );
        customBurger2.addChild( l ) ;
        customBurger2.addChild( t ) ;
        customBurger2.addChild( g ) ;
        customBurger2.addChild( j ) ;
        customBurger2.addChild( bc );

        FriesPacking f = new FriesPacking("LTL CAJ");

        myOrder2.addChild( customBurger2 );
        myOrder2.addChild( f );
        return myOrder2 ;
    }
}