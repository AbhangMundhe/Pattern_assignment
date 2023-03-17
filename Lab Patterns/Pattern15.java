import java.util.*;
class Pattern15
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter required number rows : ");
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
}