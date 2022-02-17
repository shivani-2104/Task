class Grade2DArray
{
	public static void main(String ar[])
	{
		char grades[][]=new char[3][5];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(i==0)
				    grades[i][j]='A';
			    if(i==1)
				   grades[i][j]='B';
			    if(i==2)
				   grades[i][j]='C';
			}
		}
		grades[1][4]='C';
		grades[2][0]='A';
		
		System.out.print("          ");
		for(int i=0;i<=5;i++)
		{
			if(i==0)continue;
				System.out.print("Courses "+i+" ");
		}
		System.out.println();
		for(int i=0;i<3;i++)
		{
			System.out.print("Student "+(i+1)+"   ");
			for(int j=0;j<5;j++)
			{
				System.out.print(grades[i][j]+"          ");
			}
			System.out.println();
		}
	}
}