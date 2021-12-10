package pl.coderslab.darrays;

public class Main05 {

	public static void main(String[] args) {
		int[] numbers = {4, 643, 112, 999, -69};
		int min = 0;

		for(int num : numbers) {
			if (num < min) {
				min = num;
			}
		}

		System.out.println("MIN: " + min);
	}

}
