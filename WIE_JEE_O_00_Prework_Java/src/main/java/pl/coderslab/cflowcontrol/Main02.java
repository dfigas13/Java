package pl.coderslab.cflowcontrol;

public class Main02 {

	public static void main(String[] args) {
		int nr1 = 3;
		int nr2 = 7;
		int nr3 = 11;

		int[] allElements = {nr1, nr2, nr3};

		int result = 0;
		for (int item : allElements) {
			if(item > result) {
				result = item;
			}
		}
		System.out.println("Die größte Zahl ist: " + result);



	}

}
