package GeeksForGeeks;

public class WaveArray {

	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		
		for (int i = 0; i < arr.length - 1; i += 2) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			System.out.println( "arr[i]....= "+arr[i] );
			arr[i + 1] = temp;
			System.out.println( "arr[i+1]....= "+arr[i+1] );
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
