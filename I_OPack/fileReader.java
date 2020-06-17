import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

public class fileReader {
    public static void main(String arg[]) throws Exception {
        FileReader fr =new FileReader("I:\\IBM_Java\\WorkSpace\\src\\TestIO02.java");
        BufferedReader bufferedReader=new BufferedReader(fr);
        String s2=bufferedReader.readLine();


        while(s2!= null) {
            System.out.println(s2);
            s2=bufferedReader.readLine();
        }
    }
}
