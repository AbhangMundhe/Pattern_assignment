import java.util.*;
class Pattern13
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter required number rows : ");
		int n= sc.nextInt();
		int a=64;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print((char)(a+i)+" ");
			}
			System.out.println();
		}
	}
	
}