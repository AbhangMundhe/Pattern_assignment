import java.util.*;
class Pattern7
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows required : ");
		int n=sc.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i+1;k++)
			{
				System.out.print(k+ " ");
			}
			System.out.println();
		}
	}
}