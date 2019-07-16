
public class FinalExa {
	public static void main(String[] args) {
		

	}

}
class Parent1{
	final int i;
	Parent1(){
		i=10;
	}
	Parent1(int i){
		this.i=i;
	}
	final void test(){
		System.out.println("test() Parent");
	}
}
class Child1 extends Parent1{
	/*void test(){
		System.out.println("test() Child");    //could not used as void test is final
	}*/    
}