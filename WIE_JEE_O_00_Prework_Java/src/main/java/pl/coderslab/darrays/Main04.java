package pl.coderslab.darrays;

public class Main04 {

	public static void main(String[] args) {
		int[] numbers = {4, 643, 112, 9999, 69};
		int sumOdd = 0;

		for(int number : numbers) {
			if (number % 2 == 0) {
				System.out.println(number);
			} else {
				sumOdd = sumOdd + number;
			}
		}

		System.out.println("SUM: " + sumOdd);

	}

}
