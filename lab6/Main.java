import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args)
    {
        Component theOrder = BuildOrder.getOrder();
        receiptHead();
        theOrder.printDescription();
        transaction();
        regText();
        receiptFoot();
        System.out.println();
        Component thePacking = BuildOrder.getPacking();
        packagingHead();
        thePacking.printDescription();
        regText();
    }

    public static void receiptHead(){
        System.out.println("                FIVE GUYS");
        System.out.println("            BURGERS AND FRIES");
        System.out.println("             STORE # CA-1294");
        System.out.println("          5353 ALMADEN EXPY N60");
        System.out.println("            SAN JOSE, CA 95118");
        System.out.println("             (P) 408-264-9300");
        System.out.println();
        System.out.println();
        System.out.println("           12/1/2016  1:46:54 PM");
        System.out.println();
        System.out.println("             FIVE GUYS");
    }

    public static void transaction(){
        DecimalFormat fmt = new DecimalFormat("0.00");
        double lbb = 5.59;
        double caj = 2.79;
        double sub = lbb + caj;
        double tax = sub * 0.09;
        double cash = 20;

        System.out.println();
        System.out.println("    Sub. Total:                   $"+ fmt.format( sub ));
        System.out.println("    Tax:                          $"+fmt.format( tax ));
        System.out.println("    Total:                        $"+fmt.format( sub+tax ));
        System.out.println();
        System.out.println("    Cash $"+(int)cash+"                     $"+ fmt.format( cash ));
        System.out.println("    Change                       $"+fmt.format( cash-sub-tax ));
    }

    public static void regText(){
        System.out.println("Register:1         Tran Seq No:   57845");
        System.out.println("Cashier:Sakda* S.");
    }

    public static void receiptFoot(){
        System.out.println("  ************************************");
        System.out.println("    Don't throw away your receipt!!!");
        System.out.println();
        System.out.println("   Help Five Guys and you could win!");
    }

    public static void packagingHead(){
        System.out.println("Patties  -  1");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Order Number:  45");
        System.out.println("          12/1/2016  1:46:54 PM");
        System.out.println("           FIVE GUYS");
        System.out.println();
    }


}