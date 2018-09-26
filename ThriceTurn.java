import java.util.Scanner;

public class ThriceTurn{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Round 1:");
		int roundOneValue = 0;
		int tally = 0;
		int roll = 0;
		boolean triplet = false;
		while (triplet == false){
			roll = roll + 1;
			int dieOne = (int)((Math.random()*6) + 1);
			int dieTwo = (int)((Math.random()*6) + 1);
			int dieThree = (int)((Math.random()*6) + 1);
			System.out.println("First die roll: " + dieOne);
			System.out.println("Second die roll: " + dieTwo);
			System.out.println("Third die roll: " + dieThree);
			System.out.println("End of roll: " + roll);
			System.out.println("");
			roundOneValue = dieOne + dieTwo + dieThree;
			if ((roll % 3) == 0){
				tally = tally - roundOneValue;
			}
			else {
				tally = tally + roundOneValue;
			}
			if (dieOne == dieTwo && dieTwo == dieThree){
				System.out.println("You got a triplet!");
				System.out.println("Your tally after round 1 is: " + tally);
				System.out.println("");
				triplet = true;
			}
		}

		System.out.println("Round 2:");
		System.out.println("Your triplet's worth is: " + dieOne);
		for (int xRoundTwo = 0; xRoundTwo < dieOne; xRoundTwo++){
			int dieOne = (int)((Math.random()*6) + 1);
			int dieTwo = (int)((Math.random()*6) + 1);
			int dieThree = (int)((Math.random()*6) + 1);
			System.out.println("First die roll: " + dieOne);
			System.out.println("Second die roll: " + dieTwo);
			System.out.println("Third die roll: " + dieThree);
			int roundTwoValue = dieOne * dieTwo * dieThree;
			tally = tally + roundTwoValue;
		}
		System.out.println("You have rolled your triplet's worth amount of times.");
		System.out.println("Your tally after round 2 is: " + tally);

		System.out.println("Round 3:");
		
	}
}