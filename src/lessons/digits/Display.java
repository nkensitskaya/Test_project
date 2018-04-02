package lessons.digits;

public class Display {

	private int displayNumber;
	private int displayLength;

	public Display(int displayNumber){
		this.displayNumber = displayNumber;
		this.displayLength = getDisplayLength();
	}

	public int getDisplayLength() {
		displayLength = Integer.toString(displayNumber).length();
		return displayLength;
	}

	public void printToSevenSegments(){
		Digit[] digits = new Digit[displayLength];
		for (int i = 0; i < displayLength; i++) {
			char number = Integer.toString(displayNumber).charAt(i);
			String s = String.valueOf(number);
			digits[i] = new Digit(Integer.parseInt(s));
		}
		System.out.println(digits);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < displayLength; j++) {
				digits[j].printDigit(i);
			}
			System.out.println();
		}
	}

}
