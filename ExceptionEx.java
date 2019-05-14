package pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionEx {

	public static void main(String[] args) throws IOException {

		int i=10,j=0,t=10;
		
		WrapperClasses w=new WrapperClasses();
		try{
			w.example();
			
		}catch(Exception e){
			System.out.println("HELLO");
		}
		

		FileInputStream f=null;
		try{
			
			f=new FileInputStream("D:\\hello.txt");
			t=i/j;
			f.close();
		}catch(FileNotFoundException e){
			File file=new File("D:\\hello.txt");
			if (file.createNewFile())
			{
			    System.out.println("File is created!");
			} else {
			    System.out.println("File already exists.");
			}
		
		}
		catch(Exception e){
			j=3;
			t=i/j;
			e.printStackTrace();
		}
		System.out.println(t);
	}

}
