package lessons;

import java.util.Arrays;

public class openDoors {

	public static void main(String[] args) {
		boolean[] doors = new boolean[100];
		Arrays.fill(doors, false);
		printDoorsStatus(doors);

		for (int i = 1; i < 100; i++){
			for (int j = i; j<100; j=j+i) {
				doors[j-1] = updateDoorStatus(doors[j-1]);
			}
		}
		printDoorsStatus(doors);

	}

	private static boolean updateDoorStatus(boolean status){
		return (!status);
	}

	private static void printDoorsStatus(boolean[] doors) {
		for (int num = 0; num < doors.length; num++) {
			if (doors[num]) {
				System.out.print("[O]");
			} else {
				System.out.print("[X]");
			}
		}
		System.out.println();
	}

}
