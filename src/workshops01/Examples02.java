package workshops01;

import java.util.Arrays;

public class Examples02 {

	public static void main(String[] args) {
		//sýnýrlarý belirlenen array üzerinde çalýþma yapmak
		int arr[][]=new int[2][4];
		arr[0]=new int[] {3,5,9,10};
		arr[1]=new int[] {3,5};
		
		System.out.println(Arrays.deepToString(arr));
		
		for (int[] is : arr) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(is[i]);
				
			}
		}

	}

}
