
public class AbstractEx {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p= new Child();
		p.display();
	}

}
abstract class Employ{
	int a=10,b=20;
	void display(){
		System.out.println(a+" "+b);
	}
}
abstract class Parent{
	abstract void display();
}
class Child extends Parent{
	void display(){
		System.out.println("HELLO");
	}
}