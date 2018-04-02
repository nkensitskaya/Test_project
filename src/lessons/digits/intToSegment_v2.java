package lessons.digits;

public class intToSegment_v2 {

	public static void main(String[] args) {
		Display display = new Display(4567894);

		System.out.println(display.getDisplayLength());
		display.printToSevenSegments();
	}

}
