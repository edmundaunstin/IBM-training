class SamplePrg7{
	public static void main(String args[]){
		int a=123,temp=0;
		int b=a;
		while(a!=0){
			temp=temp*10+a%10;
			a=a/10;
			}
		if(b==temp)
		 	System.out.print("palin");
		}
}