/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		// Put your code here
		int coins= Integer.parseInt(args[0]);
		int quarters= coins /25;
		int cents= coins % 25;
		System.out.println("you need- "+ quarters+" quarters and "+cents+"cents");


		//Use 1 quarters and 3 cents
	}
}