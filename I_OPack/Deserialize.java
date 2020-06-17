import java.io.*;

public class TestIO4 {
    public static void main(String args[]) throws Exception {

        FileInputStream fos = new FileInputStream("i:\\IBM_Java\\WorkSpace\\Obj.txt");
        ObjectInputStream oos = new ObjectInputStream(fos);
        EmployeeIO01 e1 =(EmployeeIO01)oos.readObject();
        System.out.println("Employee e1 serialized to obj.txt");
        System.out.println(e1);
    }

}
