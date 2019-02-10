

public class Main {

	public static void main(String[] args) {
		// Gumball Machine Type 1
		GumballMachine gumballMachine = new GumballMachine(5, 1);

		System.out.println(gumballMachine);

		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertCoin( 25 );
		gumballMachine.turnCrank();


		// Gumball Machine Type 2
		GumballMachine gumballMachine2 = new GumballMachine(5, 2);

		System.out.println(gumballMachine2);

		gumballMachine2.insertCoin( 25 );
		gumballMachine2.turnCrank();

		System.out.println(gumballMachine2);

		gumballMachine2.insertCoin( 25 );
		gumballMachine2.insertCoin( 25 );
		gumballMachine2.turnCrank();
		gumballMachine2.turnCrank();


		// Gumball Machine Type 3
		GumballMachine gumballMachine3 = new GumballMachine(5, 3);

		System.out.println(gumballMachine3);

		gumballMachine3.insertCoin( 5 );
		gumballMachine3.turnCrank();

		System.out.println(gumballMachine3);

		gumballMachine3.insertCoin( 1 );
		gumballMachine3.insertCoin( 5 );
		gumballMachine3.insertCoin( 10 );
		gumballMachine3.insertCoin( 13 );
		gumballMachine3.insertCoin( 25 );
		gumballMachine3.insertCoin( 5);
		gumballMachine3.turnCrank();
	}
}
