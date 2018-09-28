import java.util.Scanner;

public class SimpleCipher{
	public static void main(String[] args){
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String cipher = "";

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a statement:");
		String statement = scan.nextLine();
		System.out.println("How many letters in the alphebet would you like to shift the statement?");
		int shift = scan.nextInt();

		for (int x = 0; x < statement.length(); x++){
			char letter = statement.charAt(x);
			for (int y = 0; y < alphebet.length(); y++){
				char letterShifter = alphebet.charAt(y);
				int shifterCharacter = y + shift;
				if (letter == letterShifter){
					if (shifterCharacter <= 25){
						cipher = cipher + alphabet.charAt(shifterCharacter);
					} else {
						cipher = cipher + alphabet.charAt(shifterCharacter - 26);
					}
				}
			}
		}

		System.out.println(cipher);
	}
}