package p2;
import java.util.*;
import p1.ClassA;
public class classb {
	public static void main(String args[])
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter value");
	int a =s.nextInt();
	ClassA ca = new ClassA();
	boolean k =ca.verify(a);
	if(k)
	{
		System.out.print("Even Number");
	}
	else
	{
		System.out.println("not a number");
	}
	s.close();
	}
}
