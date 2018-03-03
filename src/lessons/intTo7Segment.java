package lessons;

import java.util.Scanner;

public class intTo7Segment {

	public static void main(String[] args) {
		String num = enterInteger();
		printToSegment(num);

	}

	private static void printToSegment(String num) {
		for (int k = 1; k<=5; k++) {
			for (int i = 0; i < num.length(); i++) {
				if (k == 1) {
					if ((num.charAt(i) == '1' || num.charAt(i) == '4')) {
						System.out.print("..." + " ");
					} else{
						System.out.print("._." + " ");
					}
				}

				if (k == 2) {
					if (num.charAt(i) == '1' || num.charAt(i) == '2' || num.charAt(i) == '3' || num.charAt(i) == '7')  {
						System.out.print("..|" + " ");
					} else if (num.charAt(i) == '5' || num.charAt(i) == '6') {
						System.out.print("|.." + " ");
					} else {
						System.out.print("|.|" + " ");
					}
				}

				if (k == 3) {
					if (num.charAt(i) == '1' || num.charAt(i) == '7' || num.charAt(i) == '0')  {
						System.out.print("..." + " ");
					} else {
						System.out.print("._." + " ");
					}
				}

				if (k == 4) {
					if (num.charAt(i) == '2')  {
						System.out.print("|.." + " ");
					} else if (num.charAt(i) == '6' || num.charAt(i) == '8' || num.charAt(i) == '0') {
						System.out.print("|.|" + " ");
					} else {
						System.out.print("..|" + " ");
					}
				}

				if (k == 5) {
					if (num.charAt(i) == '1' || num.charAt(i) == '4' || num.charAt(i) == '7')  {
						System.out.print("..." + " ");
					} else {
						System.out.print("._." + " ");
					}
				}
			}
			System.out.println();
		}
	}

	private static String enterInteger() {
		Scanner reader = new Scanner(System.in);
		return reader.next();
	}

}