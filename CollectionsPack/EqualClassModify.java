package CollectionsPack;

import java.util.HashSet;

public class EqualClassModify {
	static HashSet<Object> hs=new HashSet<Object>();
	public static void main(String[] args) {
		Empoyee e1=new Empoyee(123,"Ram","CSE","Manager");
		Empoyee e2=new Empoyee(123,"Ram","CSE","Manager");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1.equals(e2));
		hs.add(e1);
		hs.add(e2);
		System.out.println(hs);
	}
}
	class Empoyee{
		Integer empId;
		String empName;
		String empDept;
		String empDeg;	
	
	public Empoyee(int empId, String empName,String empDept, String empDeg){
		this.empId=empId;
		this.empName=empName;
		this.empDept=empDept;
		this.empDeg=empDeg;
	}
	public boolean equals(Object emp){
		Empoyee e=(Empoyee)emp;
		boolean flag=empId.equals(e.empId)&& empName.equals(e.empName) && empDept.equals(e.empDept) && empDeg.equals(e.empDeg);
		return flag;
	}
	public int hashCode(){
		int c=empId.hashCode()+empName.hashCode()+empDept.hashCode()+empDeg.hashCode();
		return c;
	}
	public String toString(){
		String str=" "+empId+" "+empName+" "+empDept+" "+empDeg;
		return str;
	}
	}

