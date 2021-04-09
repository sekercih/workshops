package workshops01;

public class Examples03 {

	int x,y;
	public Examples03(int x,int y) {
		initialize(x,y);
	}
		public void initialize(int x, int y) {
		this.x=x*x;
		this.y=y*y;
		
	}
		public static void main(String[] args) {
			int x=3,y=5;
			Examples03 obj=new Examples03(x,y);
			System.out.println(obj.x+" : "+obj.y);
			
			// yukarýdaki kodumuzun çýktýsý ne olur?
			// a>9 : 25
			// b>3 : 5 
			// c>15: 15
			

		}

	}
