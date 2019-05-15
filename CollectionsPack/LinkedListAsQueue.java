package CollectionsPack;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Vector;

public class LinkedListAsQueue {
	static LinkedList<String> ll=new LinkedList<String>();
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		
		int a;
		a=s.nextInt();
		switch(a){
		case 1:
			Enqueue();
			break;
		case 2:
			Dequeue();
			break;
		case 3:
			Peek();
			break;
		case 4:
			Display();
			break;
		}
		
	}

		
static void Enqueue(){	
		
		String str;
		str=s.next();
		ll.offer(str);
		
				
	}
static void Dequeue(){
	ll.poll();
	
}
static void Peek(){
	ll.peek();
	
}
static void Display(){
	System.out.println(ll);
}
}
