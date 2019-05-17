import java.io.BufferedWriter;
import java.io.FileWriter;

public class fileWrite {
    public static void main (String[] args) throws Exception {
        FileWriter fw= new FileWriter("I:\\IBM_Java\\WorkSpace\\src\\tMain.java");
        BufferedWriter bw= new BufferedWriter(fw);

        bw.write("import java.util.*;");
        bw.newLine();
        bw.write("public static void main(String[] arg[]) { ");
        bw.newLine();
        bw.write("System.out.prinln(\"Hello...... \")");
        bw.newLine();
        bw.write("  }");
        bw.newLine();
        bw.write("}");
        bw.newLine();


        bw.close();
        fw.close();

        System.out.println("TestMain Completed....");


    }
}
