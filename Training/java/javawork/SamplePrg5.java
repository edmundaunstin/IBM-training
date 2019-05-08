class SamplePrg5{
	public static void main(String args[]){
		int a=100;
		boolean bool=false;
		for(int i=2;i<=a;i++){
			for(int j=2;j<i/2;j++){
				if(i%j==0)
					bool=true;
			}
				if(bool==false)
					System.out.println(a+" is a prime");
			}		
		}
}