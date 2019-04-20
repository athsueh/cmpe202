import java.util.function.Function;
import java.util.stream.Stream;

public class Decorator implements Component {

    private Component component;

    public Decorator( Component c )
    {
        component = c ;
    }

    public static Component Decorate(Component c, Function<Component,Component>... decoratorList){ // Second parameter is list of decorator functions
        return Stream.of(decoratorList).reduce( x -> x, Function::andThen).apply(c); // Applies list of decorator functions onto c
    }

    public String operation()
    {
        return component.operation() ;
    }

    public static Component A( Component c ){
        return new Component() {
            public String operation() {
                return "<em>" + c.operation() + "</em>";
            }
        };
    }
    public static Component B( Component c ){
        return new Component() {
            public String operation() {
                return "<h1>" + c.operation() + "</h1>";
            }
        };
    }
}