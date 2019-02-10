

public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin( int value) {
		System.out.println("You inserted a Coin: " + value);
		gumballMachine.setState(gumballMachine.getHasCoinState());
	}
 
	public void ejectCoin() {
		System.out.println("You haven't inserted a Coin");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's not enough Coin(s)");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for Coin";
	}
}
