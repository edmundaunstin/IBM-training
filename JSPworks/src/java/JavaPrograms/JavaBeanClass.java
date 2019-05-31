
package JavaPrograms;


public class JavaBeanClass {
    private String empId;
    private String empName;
    private String empDept;
    private String empDeg;
    
    public JavaBeanClass()
    {
        super();
    }
    
    public JavaBeanClass(String id,String name,String dept,String desg) {
		super();
		this.empId=id;
		this.empName=name;
		this.empDept=dept;
		this.empDeg=desg;
	}

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public String getEmpDeg() {
        return empDeg;
    }

    public void setEmpDeg(String empDeg) {
        this.empDeg = empDeg;
    }
    
}
