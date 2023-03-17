import java.util.*;
class PatternT13
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows required");
		int n =sc.nextInt();
		
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}