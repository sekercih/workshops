package workshops01;

public class Examples01 {

	public static void main(String[] args) {
		int num[] = { 1, 5, 6, 8, 14, 54, 77, 220, 2, 3 };

		// 2 ye b�l�nen ve b�l�nmeyen say�lar� bulunuz

		System.out.print("ikiye b�l�nmeyen sayilar = ");

		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 != 0) {
				System.out.print(num[i] + " ");
			}
			
		}System.out.println();
		System.out.println("ikiye b�l�nenler =");
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.print(num[i] + " ");
			}
		}

	}

}
