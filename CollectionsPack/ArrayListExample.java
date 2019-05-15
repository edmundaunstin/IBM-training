package CollectionsPack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
	//static LinkedList<String> al=new LinkedList<String>();
	static ArrayList<String> al=new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<String> al=new ArrayList<String>();
		al.add("HELLO");
		al.add("MY");
		al.add("NAME");
		al.add("IS");
		al.add("EDMUND");
		al.add("AUNSTIN");
		al.add("HELLO");
		al.add("HELLO");
		al.add("HELLO");
		
		System.out.println(al);
		
		al.add(6,"YES");
		System.out.println(al);
		
		al.remove("HELLO");
		System.out.println(al);
		
		al.set(7, "HELL");
		System.out.println(al);
		
		System.out.println(al.get(4));
		System.out.println(al.indexOf("EDMUND"));
		System.out.println(al.lastIndexOf("HELLO"));
		System.out.println("al.size() in main : " + al.size());

		listIteratorExample();
	}

	static void listIteratorExample(){
		System.out.println("al.size() : " + al.size());
		List<String> aList=al.subList(2,4);
		System.out.println("aList.size() : " + aList.size());
		ListIterator<String> li=aList.listIterator();
		String s;
		while(li.hasNext()){
			s=li.next();
			System.out.println(s);
		} 
		
	}
}