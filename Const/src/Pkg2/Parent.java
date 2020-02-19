package Pkg2;
public class Parent
{
	public Parent()
	{
		this(1,2,3);
		System.out.println(" parent Default Constructor");
	}
	public Parent(int a)
	{
		this();
		System.out.println("parent 1 para constructor");
	}
	public Parent(int a,int b)
	{
		this(1);
		System.out.println("parent 2 para constructor");
	}
	public Parent(int a,int b,int c)
	{
		System.out.println("parent 3 para constructor");
	}

	public void m1()
	{
	
		System.out.println("Parent default method");
	}
	public void m1(int a)
	{
		
		System.out.println("Parent 1 para method");
	}
	public void m1(int a, int b)
	{
		
		System.out.println("Parent 2 para method ");
	}
	public void m1(int a,int b,int c)
	{
		System.out.println("Parent 3 para method");
	}


}
