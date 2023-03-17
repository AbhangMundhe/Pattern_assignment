import java.util.*;
class PatternT11
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows required : ");
		int a = sc.nextInt();
		
		for(int i=a;i>0;i--)
		{
			for(int j=0;j<=a-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=a;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}