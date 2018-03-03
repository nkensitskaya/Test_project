package lessons;

public class openDoors {

	public static void main(String[] args) {
		int[] doors = new int[100];
		initDoorsStatus(doors);
		printDoorsStatus(doors);

		for (int i = 0; i < 100; i++){
			for (int j = i; j<100; j++) {
				if ((j+1)%(i+1) == 0 ){
				doors[j] = updateDoorStatus(doors[j]);
				}
			}
		}

		printDoorsStatus(doors);

	}

	private static int updateDoorStatus(int status){
		return (status+1) % 2;
	}

	private static void printDoorsStatus(int[] doors) {
		for (int num : doors) {
			if (doors[num]==0) {
				System.out.print("[X]");
			} else {
				System.out.print("[O]");
			}
		}
		System.out.println();
	}

	private static void initDoorsStatus(int[] mass) {
		for (int i=0; i<mass.length; i++){
			mass[i] = 0;
		}
	}
}
