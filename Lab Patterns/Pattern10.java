import java.util.*;
class Pattern10
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows required : ");
		int a = sc.nextInt();
		int x=64;
		for(int i=a;i>0;i--)
		{
			for(int j=0;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=a;k++)
			{
				System.out.print((char)(x+k)+(" "));
			}
			System.out.println();
		}
	}
}