public class InterfaceEx {
	public static void main(String[] args) {
		Shap sh;// = new Shap();
		Rectangles r1 = new Rectangles(10, 20);
		Rectangles r2 = new Rectangles(11, 21);
		Rectangles r3 = new Rectangles(12, 22);

		Circles c1 = new Circles(30);
		Circles c2 = new Circles(31);
		Circles c3 = new Circles(32);

		Square sq1 = new Square(40);
		Square sq2 = new Square(41);
		Square sq3 = new Square(42);
		
		Cube cb1 = new Cube(50);
		Cube cb2 = new Cube(51);
		Cube cb3 = new Cube(52);
		
		Solids[] solidsA = new Solids[3];
		solidsA[0] = cb2;
		solidsA[1] = cb1;
		solidsA[2] = cb3;
		
		Shap[] ShapA = new Shap[12];
		ShapA[0] = sq2;
		ShapA[1] = r1;
		ShapA[2] = sq1;
		ShapA[3] = c3;
		ShapA[4] = r2;
		ShapA[5] = r3;
		ShapA[6] = c2;
		ShapA[7] = c1;
		ShapA[8] = sq3;
		ShapA[9] = cb1;
		ShapA[10] = cb2;
		ShapA[11] = cb3;
		
		processShap(ShapA);
		processSolids(solidsA);
		
		
	}
	
	static void processShap(Shap[] sArray) {
		for(int i = 0; i < sArray.length; i++) {
			sArray[i].findArea();
			sArray[i].findPerimeter();
			System.out.println("--------------------------------------------------");
		}
	}
	static void processSolids(Solids[] sdArray) {
		for(int i = 0; i < sdArray.length; i++) {
			sdArray[i].findVolume();
			System.out.println("--------------------------------------------------");
		}
	}
	
}
interface Solids{
	void findVolume();
}

class Cube implements Solids, Shap{
	double l;
	public Cube(double l) {
		this.l = l;
	}
	public void findVolume() {
		double volume = l * l * l;
		System.out.println("Volume of Cube : " + volume);
	}
	public void findArea() {
		double area = l * l;
		System.out.println("Area of Cube in 2D space : " + area);
	}
	public void findPerimeter() {
		double perimeter = 4 * l;
		System.out.println("Perimeter of Cube in 2D space : " + perimeter);
	}	
}

interface Shap{
	abstract public void findArea() ;
	abstract public void findPerimeter() ;
}
class Rectangles implements Shap{
	double l, b;
	public Rectangles(double le, double bt) {
		l = le;
		b = bt;
	}
	public void findArea() {
		double area = l * b;
		System.out.println("Area of Rectangles : " + area);
	}
	public void findPerimeter() {
		double perimeter = 2 * (l + b);
		System.out.println("Perimeter of Rectangles : " + perimeter);
	}	
}
class Circles implements Shap{
	double r;
	public Circles(double rd) {
		r = rd;
	}
	public void findArea() {
		double area = 3.146 * r * r;
		System.out.println("Area of Circles : " + area);
	}
	public void findPerimeter() {
		double perimeter = 2 * 3.146 * r;
		System.out.println("Perimeter of Circles : " + perimeter);
	}	
}
class Square implements Shap{
	double l;
	public Square(double l) {
		this.l = l;
	}
	public void findArea() {
		double area = l * l;
		System.out.println("Area of Square : " + area);
	}
	public void findPerimeter() {
		double perimeter = 4 * l;
		System.out.println("Perimeter of Square : " + perimeter);
	}	
}
