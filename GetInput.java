import java.util.Scanner;

class Getinput
{
	public static void main(String ags[])
	{
		int a;
		int b;
		String s;
		Scanner v=new Scanner(System.in);
		System.out.println("enter string");
		s=v.nextLine();
		System.out.println("enter integer");
		a=v.nextInt();
		System.out.println("enter 2nd integer");
		b=v.nextInt();
		System.out.println("entered string="+s);
		System.out.println("entered integer="+a);
		System.out.println("entered 2nd integer="+b);
	}
}