/*
PROGRAM IS WRITTEN BY EDMUND AUNSTIN
 */
package I_OPack;

import java.io.File;

public class IOFileExample {

	public static void main(String[] args) throws Exception {
		File f=new File("E:\\Training\\java\\javawork\\I_OPack\\IOFileExample.java");
		System.out.println("f.isFile() :" +f.isFile()) ;
		System.out.println("f.isFile() :" +f.isDirectory());
		System.out.println("f.isFile() :" +f.canExecute());
		System.out.println("f.isFile() :" +f.canRead());
		System.out.println("f.isFile() :" +f.canWrite());
		
		System.out.println("f.isFile() :" +f.getPath());
		System.out.println("f.isFile() :" +f.getParent());
		System.out.println("f.isFile() :" +f.getName());
		
		System.out.println("f.isFile() :" +f.getFreeSpace());
		System.out.println("f.isFile() :" +f.getTotalSpace());
		System.out.println("f.isFile() :" +f.getUsableSpace());
		
		System.out.println("f.isFile() :" +f.getAbsolutePath());
		System.out.println("f.isFile() :" +f.hashCode());
		System.out.println("f.isFile() :" +f.lastModified());
		System.out.println("f.isFile() :" +f.length());
		System.out.println("f.isFile() :" +f.list());
		
		File fArray[]=f.listRoots();
		for(File s:fArray){
		System.out.println(s);
		}
		
		File f1=new File("E:\\Training\\java\\javawork\\I_OPack\\ExampleTextFile.txt");
		if(f1.exists()){
			f1.delete();
		}
		else{
			f1.createNewFile();
			f1.createTempFile("ExampleTextFile2", ".txt");
		}
		System.out.println(f1.isHidden());
		
	}

}
