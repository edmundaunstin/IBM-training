package CollectionsPack;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	static HashSet<String> hs=new HashSet<String>();
	public static void main(String[] args) {
		
		hs.add("HELLO");
		//hs.add(123);
		//hs.add(12.45);
		//hs.add(true);
		hs.add("HELLO");
		System.out.println(hs);
		System.out.println("SIZE OF HASHSET   "+hs.size());
		hs.remove("HELLO");
		System.out.println(hs.contains(123));
		System.out.println(hs.isEmpty());
		System.out.println(hs);
		
		
		
		HashSet hs2=new HashSet();
		hs2.add("SAMPLE");
		hs2.add(456);
		hs2.add(1002.12);
		hs2.add(false);
		hs.addAll(hs2);
		System.out.println(hs);
		
		hs.removeAll(hs2);
		System.out.println(hs);
		//hs.retainAll(hs2);
		//System.out.println(hs);
		
		
		hs.add("HELLO");
		hs.add("H");
		hs.add("HE");
		hs.add("HEL");
		hs.add("HELL");
		
		
		//arrayWithObject();
		//arrayWithString();
		iteratorExample();
	}
		
	static void arrayWithObject(){	
		Object sArray[]=hs.toArray();
		for(int i=0;i<sArray.length;i++){
			System.out.println(sArray[i]);
		}
		String s=null;
		for(int i=0;i<sArray.length;i++){
			s=(String)sArray[i];
			System.out.println(s);
		}
	}
		
	static void arrayWithString(){
		
		String sArray[]=new String[hs.size()];
		hs.toArray(sArray);
		String s=null;
		for(int i=0;i<sArray.length;i++){
			s=sArray[i];
			System.out.println(s);
		}

	}
	
	static void iteratorExample(){
		Iterator<String> it=hs.iterator(); 
		String s;
		while(it.hasNext()){
			s=it.next();
			System.out.println(s);
			it.remove();
		}
	}
	
	
}	
	
