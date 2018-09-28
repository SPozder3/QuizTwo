public class ThriceSimulation{
	                                                                                                   public static void main(String[] args){
		double totalTally = 0;
		for (int i = 0; i < 1000; i++){
			double tally = 0;
			int tripletsWorth = 0;

			boolean triplet = false;
			int roll = 1; //checks if it is a third roll
			while (! triplet){
				int dieOne = (int)((Math.random()*6) + 1);
				int dieTwo = (int)((Math.random()*6) + 1);
				int dieThree = (int)((Math.random()*6) + 1);
				int roundOneValue = dieOne + dieTwo + dieThree;
				if ((roll % 3) == 0){
					tally = tally - roundOneValue;
				}
				else {
					tally = tally + roundOneValue;
				}
				roll = roll + 1;
				if (dieOne == dieTwo && dieTwo == dieThree){
					tripletsWorth = dieOne;
					triplet = true;
				}
			}

			for (int roundTwo = 0; roundTwo < tripletsWorth; roundTwo++){
				int dieOne = (int)(Math.random()*6 + 1);
				int dieTwo = (int)(Math.random()*6 + 1);
				int dieThree = (int)(Math.random()*6 + 1);
				int roundTwoValue = diceOne * diceTwo * diceThree;
				tally = tally + roundTwoValue;
			}

			int round = 0;
			boolean tripletThree = false;
			while (! tripletThree)){
				int dieOne = (int)(Math.random()*6 + 1);
				int dieTwo = (int)(Math.random()*6 + 1);
				int dieThree = (int)(Math.random()*6 + 1);
				tally = tally + Math.pow(3,roundThree);
				if (! (dieOne == dieTwo && dieTwo == dieThree){
					tally = tally + Math.pow(3,round);
				else{
					if (dieOne == tripletsWorth){
						tally = tally * 3;
					}
					else{
						tally = tripletsWorth;
					}
					System.out.println("Congratulations! Your tally is: " + tally);
					tripletThree = true;
				}
				round = round + 1;
			}
			totalTally = totalTally + tally;	
		} 
		double averageTally = totalTally/1000;
		System.out.println("The average tally is: " + averageTally);
	}
} 