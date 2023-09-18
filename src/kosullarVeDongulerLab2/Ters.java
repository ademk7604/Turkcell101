package kosullarVeDongulerLab2;

import java.util.Scanner;

public class Ters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lutfen bit yazi");
		String textString = scanner.nextLine();
		for (int i = textString.length() - 1; i >= 0; i--) {
			System.out.print(textString.charAt(i));
		}
	}

}
