import java.util.*;
class Pattern3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		System.out.println();
	}
}