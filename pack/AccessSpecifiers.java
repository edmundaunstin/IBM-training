package pack;

public class AccessSpecifiers extends Object{
	
	
	public static void main(String[] args) {
		Employy e=new Employy();
		e.display();
		e=null;    //nullify the reference 
		System.gc();  // calls the garbage collector and the finalize method
		e.display();
		

	}
}
	class Employy extends Object{
		public String pub="PUBLIC";
		private String pri="PRIVATE";
		protected String pro="PROTECTED";
		String def="DEFAULT";
		void display(){
			System.out.println(pub);
			System.out.println(pri);
			System.out.println(pro);
			System.out.println(def);
		}
		protected void finalize() throws Throwable {
			System.out.println("REMOVED");
		}
	}


