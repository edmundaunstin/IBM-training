
public class StaticEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent2 p=new Parent2();
		p.testMethod();
		Parent2.testStaticMethod();
	}

}
class Parent2{
	static int i;
	int j;
	void testMethod(){
		System.out.println("i: "+i);
		System.out.println("j: "+j);
	}
	static void testStaticMethod(){
		System.out.println("i: "+i);
	}
}
