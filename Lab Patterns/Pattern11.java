class Pattern11
{
		public static void main(String args[])
		{
			//Scanner sc = new Scanner(String.in);
			
			for(int i=1;i<=5;i++)
			{
				for(int k=0;k<=5-i;k++)
				{
					System.out.print("  ");
				}
				for(int j=1;j<=2*i-1;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
}
