package Interview_questions;

public class FlipAnaliys {
	public static void main(String[] args) {
		int[] numbers = generateNumbers();
		displayNumbers(numbers);
	}

	public static int[] generateNumbers() {
		int[] array = new int[100];
		int number = 9;
		for (int i = 1; i < 100; i++) {
			int lastTwoDigits = number % 100;
			int lastDigit = lastTwoDigits % 10;
			int secondLastDigit = lastTwoDigits / 10;

			if (Math.abs(lastDigit - secondLastDigit) == 3) {
				array[i] = -number;
			} else {
				array[i] = number;
			}

			number += 9;
		}
		return array;
	}

	public static void displayNumbers(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i != array.length - 1) {
				System.out.print(", ");
			}
		}
	}
}
