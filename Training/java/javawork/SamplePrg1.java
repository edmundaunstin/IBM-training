class SamplePrg1{
	public static void main(String args[]){
		int three[][][]=new int[5][][];

		int two1[][]=new int[3][];
		int two2[][]=new int[3][];
		int two3[][]=new int[3][];
		int two4[][]=new int[3][];
		int two5[][]=new int[3][];

		int a[]=new int[10];
		int b[]=new int[5];
		int c[]=new int[3];

		//two1[0]=a;
		//two1[1]=b;
		//two1[2]=c;
		two2[0]=a;
		two2[1]=b;
		two2[2]=c;
		two3[0]=a;
		two3[1]=b;
		two3[2]=c;
		two4[0]=a;
		two4[1]=b;
		two4[2]=c;
		two5[0]=a;
		two5[1]=b;
		two5[2]=c;
		three[0] = two1;
		three[0][0]=a;
		three[0][1]=b;
		three[0][2]=c;
		three[1]=two2;
		three[2]=two3;
		three[3]=two4;
		three[4]=two5;

	for(int j=0;j<three.length;j++){
		for(int k=0;k<three[j].length;k++){
			for(int m=0;m<three[j][k].length;m++){
				System.out.print(three[j][k][m]);
	      		 }
			System.out.println();
			}	
		System.out.println("*********************************");
		}
	}
}