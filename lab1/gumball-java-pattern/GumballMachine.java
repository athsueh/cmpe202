

public class GumballMachine {
 
	State soldOutState;
	State noCoinState;
	State hasCoinState;
	State soldState;
 
	State state = soldOutState;
	int count = 0;
	int type = 0;
	int total = 0;
 
	public GumballMachine(int numberGumballs, int machine) {
		soldOutState = new SoldOutState(this);
		noCoinState = new NoCoinState(this);
		hasCoinState = new HasCoinState(this);
		soldState = new SoldState(this);

		this.count = numberGumballs;
		this.type = machine;
 		if (numberGumballs > 0) {
			state = noCoinState;
		} 
	}
 
	public void insertCoin( int value ) {
		if (type == 3) // Machine 3 only accepts US coins
		{
			if (value == 1 || value == 5 || value == 10 | value == 25){
				total += value;
				System.out.println("Current Value: "+total);
				if (total >= 50){
					state.insertCoin( value );
				}
			} else {
				System.out.println("Please insert a valid coin.");
			}
		} else {
			if (value != 25){
				System.out.println("Please insert a quarter.");
				return;
			}
			if (type == 2){ // Machine 2 requires 50 cents+
				total = total+ value;
				System.out.println("Current Value: "+total);
				if (total >= 50){
					state.insertCoin( value );
				}
			} else { // Machine 1 holds 1 quarter and can pay out after 1
				state.insertCoin( value );
			}
		}


	}
 
	public void ejectCoin() {
		state.ejectCoin();
		total = 0;
	}
 
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
		if (type == 1 && total >= 25){
			total = total - 25;
		} else if (total >= 50){
			total = total - 50;
		}
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot...");
		if (count != 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}

	void refill(int count) {
		this.count = count;
		state = noCoinState;
	}

    public State getState() {
        return state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoCoinState() {
        return noCoinState;
    }

    public State getHasCoinState() {
        return hasCoinState;
    }

    public State getSoldState() {
        return soldState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
