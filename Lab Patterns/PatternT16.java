import java.util.*;
class PatternT16
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows required : ");
		int n = sc.nextInt();
	
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1 || i==j || i==n )
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}	
				
			}
			System.out.println();
		}
	}
}