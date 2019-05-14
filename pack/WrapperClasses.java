package pack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class WrapperClasses {

	public static void main(String[] args) {
		int i=10;
		Integer i1=i;
		i=Integer.valueOf(i);
		System.out.println("i1= "+i1);
		i=i1.intValue();
		String s="10";
		int j=Integer.parseInt(s);
		String str="qwertyuiopasdfghjklzxcvbnm";
		System.out.println(new StringBuilder(str).capacity());
		System.out.println(new StringBuilder(str).length());
		StringBuilder rew=new StringBuilder(str);
		rew.trimToSize();
		System.out.println(rew.capacity());
		
		
	}
   public void example() throws FileNotFoundException,Exception{
	   FileInputStream ff=new FileInputStream("D:\\hello.txt");
	   File f=new File("D:\\hello.txt");
	   if(f.exists()){
		   System.out.println("Yes");
	   }else{
	   throw new Exception("NOT FOUND FILE HELLO");
   }
   }
}
