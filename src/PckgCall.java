import testing.PKGdoc;
import testing.Vehicle;

import java.util.Scanner;

public class PckgCall {

	public static void main(String[] args) {

		Scanner get_in = new Scanner(System.in, "UTF-8");

		Vehicle vec1 = new Vehicle("Green");

		vec1.horn();
		System.out.println("After object creation color is: " + vec1.getColor() + '.');
		vec1.setColor("Blue");
		System.out.println("After changing by compile-time color is: " + vec1.getColor() + '.');
		System.out.print("Now set a new color: ");
		vec1.setColor(get_in.nextLine());
		System.out.println("After getting color from user color is: " + vec1.getColor() + '.');

		PKGdoc.help();
	}
}
