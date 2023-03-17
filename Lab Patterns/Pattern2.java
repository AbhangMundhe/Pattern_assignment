import java.util.*;
class Pattern2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		char x = 64;
		for(int i=1;i<=5;i++)
		{
			for(char j=1; j<=i;j++)
			{
				System.out.print((char)(x+j)+" ");
				
			}
			System.out.println();
		}
	}
}