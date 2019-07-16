public class Simple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1, e2;
		e1 = new Employee();
		e2 = new Employee();
		e1.setEmployee(123, "Edmund", "CSE", "Head");
		e2.setEmployee(234, "Raj");
		e1.display();
		e2.display();
		Employee e4 = new Employee(1111, "AAA", "TESTING", "Tester");
		Employee e5 = new Employee(1112, "BBB");
		e4.display();
		e5.display();
	}
}
class Employee {
	String empName;
	int empId;
	String empDept;
	String empDeg;
	Employee() {
		empId = 0;
		empName = " YOU HAVE NO VALUE IN THIS FIELD";
		empDept = " YOU HAVE NO VALUE IN THIS FIELD";
		empDeg = " YOU HAVE NO VALUE IN THIS FIELD";
	}
	Employee(int id, String name, String dept, String deg) {
		empId = id;
		empName = name;
		empDept = dept;
		empDeg = deg;
	}
	Employee(int id, String name) {
		empId = id;
		empName = name;
		empDept = "";
		empDeg = "";
	}
	void setEmployee(int id, String name) {
		empId = id;
		empName = name;
	}
	void setEmployee(int id, String name, String dept, String deg) {
		empId = id;
		empName = name;
		empDept = dept;
		empDeg = deg;
	}
	void display() {
		System.out.println("ID          : " + empId);
		System.out.println("NAME        : " + empName);
		System.out.println("DEPARTMENT  : " + empDept);
		System.out.println("DESIGNATION : " + empDeg);
		System.out.println("*******************************************************");
	}
}