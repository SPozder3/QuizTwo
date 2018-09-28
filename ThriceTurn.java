import java.util.Scanner;

public class ThriceTurn{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Round 1:");
		int roll = 0;
		int tally = 0;
		int tripletsWorth = 0;
		int round = 0;
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
			int roundOneValue = dieOne + dieTwo + dieThree;
			if ((roll % 3) == 0){
				tally = tally - roundOneValue;
			}
			else {
				tally = tally + roundOneValue;
			}
			if (dieOne == dieTwo && dieTwo == dieThree){
				System.out.println("You got a triplet!");
				System.out.println("Your tally after round 1 is: " + tally);
				tripletsWorth = dieOne;
				triplet = true;
			}
		}

		System.out.println("");

		System.out.println("Round 2:");
		System.out.println("Your triplet's worth is: " + tripletsWorth);
		for (int xRoundTwo = 0; xRoundTwo < tripletsWorth; xRoundTwo++){
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

		System.out.println("");

		System.out.println("Round 3:");
		System.out.println("Will you retire?");
		String retire = scan.nextLine();
		while (! retire.equals("yes")){
			int dieOne = (int)(Math.random()*6 + 1);
			int dieTwo = (int)(Math.random()*6 + 1);
			int dieThree = (int)(Math.random()*6 + 1);
			System.out.println("First die roll: " + dieOne);
			System.out.println("Second die roll: " + dieTwo);
			System.out.println("Third die roll: " + dieThree);
			System.out.println("End of roll: " + roll + 1);
			tally = tally + Math.pow(3,round);
			if (! (dieOne == dieTwo && dieTwo == dieThree){
				tally = tally + Math.pow(3,round);
			else{
				System.out.println("You got a triplet!")
				if (dieOne == tripletsWorth){
					System.out.println("Your triplet is equal to round one's triplet");
					tally = tally * 3;
					System.out.println("Your tally is: " + tally);
					retire = "yes";
				}
				else{
					tally = tripletsWorth;
					System.out.println("Congratulations! Your tally is: " + tally);
					retire = "yes";
				}
			}
			round = round + 1;
			System.out.println("Your tally is: " + tally);
			System.out.println("Will you retire?");
			retire = scan.nextLine();
		}
	}
}