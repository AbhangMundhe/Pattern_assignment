import java.util.*;
class Pattern14
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter required number rows : ");
		int n= sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
}