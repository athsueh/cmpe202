public class Tester {

    public static void runTest()
    {
        Component obj = Decorator.Decorate(new ConcreteComponent(), Decorator::A, Decorator::B);
        String result = obj.operation();
        System.out.println(result);
    }

    public static void main( String [] args )
    {
        Tester t = new Tester() ;
        t.runTest() ;
    }

}