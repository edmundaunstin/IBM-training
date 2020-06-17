package I_OPack;

import java.io.FileInputStream;

public class FileInputStreamExample {
	
	public static void main(String[] args) throws Exception  {
		FileInputStream fs=new FileInputStream("E:\\Training\\java\\javawork\\I_OPack\\IOFileExample.java");
		
		//forClass(fs);
		negativeClass(fs);
		fs.close();
	}
	static void forClass(FileInputStream fs) throws Exception{
		int a=fs.available();
		for(int i=0;i<a;i++){
			int b=fs.read();
			System.out.print((char)b);
		}
	}
	static void negativeClass(FileInputStream fs) throws Exception{
		
		int b=fs.read();
		while(b!=-1){
			System.out.print((char)b);
			b=fs.read();
		}
	}
}
