class CMD
{
	public static void main(String ar[])
	{
		String list[]=new String[ar.length];
		int value=0;
		for(int i=0;i<ar.length;i++)
		{
			try
			{
				value=Integer.parseInt(ar[i]);
			}
			catch(Exception e)
			{
				list[i]=ar[i];
			}
		}
		
		for(int j=0;j<value;j++)
		{
		   for(int i=0;i<ar.length-1;i++)
		   {
			  System.out.print(list[i]+" ");			
		   }
		   System.out.println();
		}
		
	}
}