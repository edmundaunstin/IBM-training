import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestIO3 {
    public static void main(String args[]) throws Exception {
        EmployeeIO01 e1 = new EmployeeIO01("9784", "JOHN", "TRAINING", "TRAINER");
        FileOutputStream fos = new FileOutputStream("i:\\IBM_Java\\WorkSpace\\Obj.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e1);
        System.out.println("Employee e1 serialized to obj.txt");
    }

    }
     class EmployeeIO01 implements Serializable {
        String empId;
        String empName;
        String dept;
        String desg;

        public EmployeeIO01(String empId,String empName,String dept,String desg) {
            super();
            this.empId=empId;
            this.empName=empName;
            this.dept=dept;
            this.desg=desg;
        }
        public String toString() {
            String s="\n  ID : "+empId;
            s=s+"\nName  :  "+empName;
            s=s+"\nDEPT   : "+dept;
            s=s+"\nDESG  : "+desg;
            return s;
        }
     }

