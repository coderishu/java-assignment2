import java.util.*;
import java.io.*;
class ishu
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("eligible to vote");
		}
		else
		{
			System.out.println("not eligible");
		}
	}
}