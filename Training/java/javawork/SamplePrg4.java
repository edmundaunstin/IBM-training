class SamplePrg5{
	public static void main(String args[]){
		int a=10;
		boolean bool=false;
		for(int i=2;i<=a/2;i++){
			if(a%i==0)
				bool=true;
			}
		if(bool==false)
			System.out.println(a+" is a prime");
		else
			System.out.println(a+" is not a prime");		
		}
}