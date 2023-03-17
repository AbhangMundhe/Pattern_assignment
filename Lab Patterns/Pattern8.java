import java.util.*;
class Pattern8
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows required : ");
		int n=sc.nextInt();
		
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<=i-1;j++)
			{
				System.out.print("  ");
			}
			for(int k=i;k<=n;k++)
			{
				System.out.print(k+ "   ");
			}
			System.out.println();
		}
	}
}