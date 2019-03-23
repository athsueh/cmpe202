  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        // prices vary for size
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        // all basic toppings free
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles"} ;
        t.setOptions( to ) ;
        t.wrapDecorator( c ) ;
        // premium topping +variable price
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomatoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        // 1 sauce free, extra +.50
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( p ) ;
        // premium cheese 1.50 each
        CheesePremium cp = new CheesePremium("Premium Cheese Options");
        String[] cpo = {"Danish Blue Cheese"};
        cp.setOptions( cpo );
        cp.wrapDecorator( s );
        // Sides 3.00 each
        Sides si = new Sides("Sides Options");
        String[] sio = {"Shoestring Fries"};
        si.setOptions( sio );
        si.wrapDecorator( cp );
        // Bun free, or +1 if premium
        Bun bu = new Bun( "Bun Options ");
        String[] buo = {"Ciabatta (Vegan)"};
        bu.setOptions( buo );
        bu.wrapDecorator( si );

        // Setup Custom Burger Ingredients
        customBurger.setDecorator( bu ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( c ) ;
        customBurger.addChild( cp );
        customBurger.addChild( s ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
        customBurger.addChild( bu );
        customBurger.addChild( si );


        //bun
        //sides


        // Add Custom Burger to the Order
        order.addChild( customBurger );


        // Second burger
        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        Burger b2 = new Burger( "Burger Options" ) ;
        String[] bo2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" } ;
        b2.setOptions( bo2 ) ;
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        String[] co2 = { "Smoked Gouda", "Greek Feta" } ;
        c2.setOptions( co2 ) ;
        c2.wrapDecorator( b2 ) ;
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        String[] to2 = { "Crushed Peanuts" } ;
        t2.setOptions( to2 ) ;
        t2.wrapDecorator( c2 ) ;
        Premium p2 = new Premium( "Premium Options" ) ;
        String[] po2 = { "Sunny Side Up Egg*","Marinated Tomatoes" } ;
        p2.setOptions( po2 ) ;
        p2.wrapDecorator( t2 ) ;
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        String[] so2 = { "Habanero Salsa" } ;
        s2.setOptions( so2 ) ;
        s2.wrapDecorator( p2 ) ;
        CheesePremium cp2 = new CheesePremium("Premium Cheese Options");
        String[] cpo2 = {"Fresh Mozzarella"};
        cp2.setOptions( cpo2 );
        cp2.wrapDecorator( s2 );
        Sides si2 = new Sides("Sides Options");
        String[] sio2 = {"Shoestring Fries"};
        si2.setOptions( sio2 );
        si2.wrapDecorator( cp2 );
        Bun bu2 = new Bun( "Bun Options ");
        String[] buo2 = {"Gluten-Free Bun"};
        bu2.setOptions( buo2 );
        bu2.wrapDecorator( si2 );

        // Setup Custom Burger Ingredients
        customBurger2.setDecorator( bu2 ) ;
        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild( cp2 ) ;
        customBurger2.addChild( s2 ) ;
        customBurger2.addChild( t2 ) ;
        customBurger2.addChild( p2 ) ;
        customBurger2.addChild( bu2 );
        customBurger2.addChild( si2 );




        // Add Custom Burger to the Order
        order.addChild( customBurger2 );

        return order ;
    }

}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/