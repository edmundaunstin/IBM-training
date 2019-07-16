
public class TestMain4 {
	public static void main(String[] args) {
		Shapes sh = new Shapes();
		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = new Rectangle(11, 21);
		Rectangle r3 = new Rectangle(12, 22);

		Cirl c1 = new Cirl(30);
		Cirl c2 = new Cirl(31);
		Cirl c3 = new Cirl(32);

		Shapes[] shapesA = new Shapes[7];
		shapesA[6] = sh;
		shapesA[0] = c2;
		shapesA[1] = r1;
		shapesA[2] = c1;
		shapesA[3] = c3;
		shapesA[4] = r2;
		shapesA[5] = r3;
		
		processShapes(shapesA);
	}
	
	static void processShapes(Shapes[] sArray) {
		for(int i = 0; i < sArray.length; i++) {
			sArray[i].findArea(); //the specific object with the address in the array will take the process to its class and  
			sArray[i].findPerimeter(); //finds the specified function only on the runtime 
			System.out.println("--------------------------------------------------");
		}
	}
}
class Shapes{
	double l, b, r;
	public void findArea() {
		System.out.println("Area of Shapes");
	}
	public void findPerimeter() {
		System.out.println("Perimeter of Shapes");
	}
}
class Rectangle extends Shapes{
	public Rectangle(double le, double bt) {
		l = le;
		b = bt;
	}
	public void findArea() {
		double area = l * b;
		System.out.println("Area of Rectangle : " + area);
	}
	public void findPerimeter() {
		double perimeter = 2 * (l + b);
		System.out.println("Perimeter of Rectangle : " + perimeter);
	}	
}
class Cirl extends Shapes{
	public Cirl(double rd) {
		r = rd;
	}
	public void findArea() {
		double area = 3.146 * r * r;
		System.out.println("Area of Cirl : " + area);
	}
	public void findPerimeter() {
		double perimeter = 2 * 3.146 * r;
		System.out.println("Perimeter of Cirl : " + perimeter);
	}	
}
