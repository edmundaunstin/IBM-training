package CollectionsPack;

import java.util.TreeSet;

public class MakeACompareableOject {
	static TreeSet<Object> ts=new TreeSet<Object>(); 
	public static void main(String[] args) {
		Empoye e1=new Empoye(123,"Ram","CSE","Manager");
		Empoye e2=new Empoye(456,"Aam","CSE","Manager");
		Empoye e3=new Empoye(789,"Eam","CSE","Manager");
		Empoye e4=new Empoye(321,"Yam","CSE","Manager");
		Empoye e5=new Empoye(523,"Bam","CSE","Manager");
		Empoye e6=new Empoye(754,"Nam","CSE","Manager");
		Empoye e7=new Empoye(784,"Mam","CSE","Manager");
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		ts.add(e6);
		ts.add(e7);
		for(Object str:ts){
		System.out.println(str);
		}
	}

}
class Empoye  implements Comparable<Empoye>{
	Integer empId;
	String empName;
	String empDept;
	String empDeg;	

	public Empoye(int empId, String empName,String empDept, String empDeg){
		this.empId=empId;
		this.empName=empName;
		this.empDept=empDept;
		this.empDeg=empDeg;
	}

	public int compareTo(Empoye emp){
	int v=empName.compareTo(emp.empName);
	return v;
	}
	public String toString(){
		String str=" "+empId+" "+empName+" "+empDept+" "+empDeg;
		return str;
	}
}