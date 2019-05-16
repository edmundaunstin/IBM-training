package CollectionsPack;
import java.util.Comparator;
import java.util.TreeSet;
public class CompartorExample {


	static TreeSet<Object> ts=new TreeSet<Object>(); 
	public static void main(String[] args) {
		Epoye e1=new Epoye(123,"Ram","CSE","Manager");
		Epoye e2=new Epoye(456,"Aam","CSE","Manager");
		Epoye e3=new Epoye(789,"Eam","CSE","Manager");
		Epoye e4=new Epoye(321,"Yam","CSE","Manager");
		Epoye e5=new Epoye(523,"Bam","CSE","Manager");
		Epoye e6=new Epoye(754,"Nam","CSE","Manager");
		Epoye e7=new Epoye(784,"Mam","CSE","Manager");
		
		
		CompareEmployeeByName ceb1=new CompareEmployeeByName();
		CompareEmployeeById ceb2=new CompareEmployeeById();
		
		//TreeSet<Epoye> ts1=new TreeSet<>(ceb1);
		TreeSet<Epoye> ts1=new TreeSet<>(ceb2);
		
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		ts1.add(e5);
		ts1.add(e6);
		ts1.add(e7);
		for(Object str:ts1){
		System.out.println(str);
		}
	}

}
class CompareEmployeeByName implements Comparator<Epoye>{
	public int compare(Epoye a,Epoye b){
		int n=a.empName.compareTo(b.empName);
		return n;
	}
}
class CompareEmployeeById implements Comparator<Epoye>{
	public int compare(Epoye a,Epoye b){
		int n=a.empId.compareTo(b.empId);
		return n;
	}
}



class Epoye  implements Comparable<Epoye>{
	Integer empId;
	String empName;
	String empDept;
	String empDeg;	

	public Epoye(int empId, String empName,String empDept, String empDeg){
		this.empId=empId;
		this.empName=empName;
		this.empDept=empDept;
		this.empDeg=empDeg;
	}

	public int compareTo(Epoye emp){
	int v=empName.compareTo(emp.empName);
	return v;
	}
	public String toString(){
		String str=" "+empId+" "+empName+" "+empDept+" "+empDeg;
		return str;
	}
}
