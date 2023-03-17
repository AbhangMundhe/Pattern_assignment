import java.util.*;
class Pattern16
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter required number rows : ");
		int n= sc.nextInt();
		
		for(int i=n-1;i>=1;i--)
		{
			for(int k=5;k>=n-i;k--)
			{
				System.out.print(k+" ");
			}
			
			System.out.println();
		}
	}
	
}