package pl.coderslab.darrays;

public class Main03 {

	public static void main(String[] args) {
		int[] numbers = {2, 643, 112, 9999, 69};
		int sum = 0;

		for(int number : numbers) {
			sum = sum + number;
		}
		System.out.println("SUM: " + sum);

	}

}
