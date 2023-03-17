import java.util.*;
class Pattern12
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows required : ");
		int a = sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			for(int j=0;j<=a-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+(" "));
			}
			System.out.println();
		}
	}
}