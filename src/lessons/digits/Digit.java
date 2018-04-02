package lessons.digits;

public class Digit {

	private int digitValue;
	private String[][] digitsArray = {
			{"._. ", "... ", "._. ", "._. ", "... ", "._. ", "._. ", "._. ", "._. ", "._. "},
			{"|.| ", "..| ", "._| ", "._| ", "|_| ", "|_. ", "|_. ", "..| ", "|_| ", "|_| "},
			{"|_| ", "..| ", "|_. ", "._| ", "..| ", "._| ", "|_| ", "..| ", "|_| ", "._| "},
	};

	public Digit(int digitValue) {
		this.digitValue = digitValue;
	}

	public void setDigitValue(int digitValue) {
		this.digitValue = digitValue;
	}

	public void printDigit(int lineNumber){
		System.out.print(digitsArray[lineNumber][digitValue]);
	}
}
