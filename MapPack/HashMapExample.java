package MapPack;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(1,"MY");
		hm.put(2,"NAME");
		hm.put(3,"IS");
		hm.put(4,"EDMUND");
		hm.put(5,"AUNSTIN");
		
		System.out.println(hm);
		
		Set<Integer> s=hm.keySet();
		System.out.println(s);
		for(int i:s){
			System.out.println(i);
		}
		
		Collection<String> c=hm.values();
		System.out.println(c);
		for(String str:c){
			System.out.println(str);
		}
		
		Set<Map.Entry<Integer,String>> ns=hm.entrySet();
		for(Map.Entry<Integer,String> ee:ns){
			System.out.println(ee.getKey()+"    "+ee.getValue());
		}
		

	}

}
