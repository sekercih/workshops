package workshops01;

public class Examples05 {

	public static void main(String[] args) {
		String [][] arr= {{"Feyza","Nazan","Bedirhan"},{"Naci","Fetih"}};
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				if (arr[i][j].equals("Nazan")) {
					break;
				}
			}continue;
			
		}//kodumuzun çýktýsý nedir?
		// a>Feyza Nazan Bedirhan Naci Fetif
		// b>Nazan Bedirhan Naci
		// c>Feyza Nazan
		// d>Feyza Nazan Naci Fetif 
		// e>Feyza Naci 
	}

}