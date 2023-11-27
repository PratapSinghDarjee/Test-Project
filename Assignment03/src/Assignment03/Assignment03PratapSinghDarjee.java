package Assignment03;
import java.util.Random;
public class Assignment03PratapSinghDarjee {

	public static void main(String[] args) {
		int roll = 0;
		int[] diceRolls = new int[20];
		int totalRolls = 0;

		// sample the rolls
		for(int count = 0; count <=20; count++) {
		    roll = (int)(Math.random() * 20) + 1;
		    diceRolls[roll] = diceRolls[roll - 1] +1; // crashes
		}	
		// run a report
		for(int index = 0; index < diceRolls.length; index++) {
		    System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
		    totalRolls = totalRolls + diceRolls[index];
		}
		System.out.println("Total rolls were: " + totalRolls);
		
		System.out.println("Pratap Singh Darjee");
	}

}
