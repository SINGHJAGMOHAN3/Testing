package Java_basics;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k[][]= {{3,4,5},{6,2,8}};
		int min=k[0][0];
		int col = 0;
		
		
		for(int i=0; i<2; i++)
			
		{
			for(int j=0; j<3;j++)
				
			{
				if (k[i][j]<min)
				{
					min=k[i][j];
					col=j;
				
					
				}
				
				
				
				
			
				
			
			}
			
			
			 
			
			
			
			
		}
		System.out.println(min);
		int max= k[0][col];
		int m=0;
		while(m<3)
		{
			if(k[m][col]>max)
			{
				max=k[m][col];
			}
			m++;
		}
		
		System.out.println(col);
			
		
		
		
	}
	

}


/*1
23
456
78910*/