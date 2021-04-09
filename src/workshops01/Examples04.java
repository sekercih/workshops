package workshops01;

class Cart{
	Product p;
	double totalMan;
}
class Product{
	String name;
	Double price;
}
public class Examples04 {
	public static void main(String[] args) {
		Cart c=new Cart();
		System.out.println(c.p+" : "+c.totalMan);
	}

}
// yukarýdaki kodumuzun çýktýsý ne olur?
// a>0.0 : 0.0
// b>0.0 : 0.0 : null
// c>null: 0.0
