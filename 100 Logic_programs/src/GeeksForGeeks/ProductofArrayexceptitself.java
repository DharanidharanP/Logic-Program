package GeeksForGeeks;

public class ProductofArrayexceptitself {

	void productArray(int arr[], int len) {
		// Base case
		if (len == 1) {
			System.out.print("0");
			return;
		}
		int i, temp = 1;
		int prod[] = new int[len];
		
		for (int j = 0; j < len; j++) 
			prod[j] = 1;
		// Right side
		for (i = 0; i < len; i++) {
			prod[i] = temp;
			temp *= arr[i];
			//System.out.println(temp);
		}
		// left side
		temp = 1;
		System.out.println("....................len :"+len);
		for (i = len - 1; i >= 0; i--) {
			System.out.println(prod[i]);
			prod[i] *= temp;
			temp *= arr[i];
			System.out.println("tem........:"+temp);
		}

		for (i = 0; i < len; i++)
			System.out.print(prod[i] + " ");

		return;
	}
	public static void main(String[] args) {
		ProductofArrayexceptitself pa = new ProductofArrayexceptitself();
		int arr[] = { 1,2,3,4,5};
		int len = arr.length;
		System.out.println("The product array is : ");
		pa.productArray(arr, len);
	}

}
