package workshops01;

public class Examples01 {

	public static void main(String[] args) {
		int num[] = { 1, 5, 6, 8, 14, 54, 77, 220, 2, 3 };

		// 2 ye bölünen ve bölünmeyen sayýlarý bulunuz

		System.out.print("ikiye bölünmeyen sayilar = ");

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				System.out.print(num[i] + " ");
			}
			
		}System.out.println();
		System.out.println("ikiye bölünenler =");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.print(num[i] + " ");
			}
		}

	}

}
