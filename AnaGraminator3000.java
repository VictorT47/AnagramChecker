package anagramAssignment;
import java.util.Scanner;
public class AnaGraminator3000 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
	while (true) {
		System.out.print("Enter the first word or phrase to check for anagrams or done when finished: ");
		String firstInput = scanner.nextLine();
		if (firstInput.equalsIgnoreCase("done")) {
		System.out.println("AnaGraminator3000 has been terminated!!! (▀̿Ĺ̯▀̿ ̿)");
	break;
	}
		System.out.print("Enter the second word or phrase to check for anagrams or done when finished: ");
		String secondInput = scanner.nextLine();
		
	if (secondInput.equalsIgnoreCase("done")) {
		System.out.println("AnaGraminator3000 has been terminated!!! (▀̿Ĺ̯▀̿ ̿)");
	break;
	}
		String cleanedFirst = firstInput.replaceAll("[^a-zA-Z]", "").toLowerCase();
		String cleanedSecond = secondInput.replaceAll("[^a-zA-Z]", "").toLowerCase();

	if (cleanedFirst.length() != cleanedSecond.length()) {
		System.out.println("The phrases " + firstInput + " and " + secondInput + " are not anagrams.");
	} else {
		boolean wordAnagram = true;
		for (char c = 'a'; c <= 'z'; c++) {
		int countInFirst = 0;
		int countInSecond = 0;

	for (int i = 0; i < cleanedFirst.length(); i++) {
		if (cleanedFirst.charAt(i) == c) countInFirst++;
	}
	for (int i = 0; i < cleanedSecond.length(); i++) {
		if (cleanedSecond.charAt(i) == c) countInSecond++;
	}
	if (countInFirst != countInSecond) {
		wordAnagram = false;
		break;
	}
}
	if (wordAnagram) {
		System.out.println("The phrases/words " + firstInput + " and " + secondInput + " are anagrams.");
	} else {
		System.out.println("The phrases/words " + firstInput + " and " + secondInput + "are not anagrams.");
	}
}
}
		scanner.close();
	}
}
