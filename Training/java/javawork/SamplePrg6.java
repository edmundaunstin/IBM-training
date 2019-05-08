class SamplePrg6{
	public static void main(String args[]){
		int a=123,temp=0;
		while(a!=0){
			temp=temp*10+a%10;
			a=a/10;
			}
		 System.out.print(temp);
		}
}