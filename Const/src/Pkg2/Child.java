package Pkg2;
public class Child extends Parent
{
	public Child()
	{
		this(1,2);
		System.out.println("child Default constructor");
	}
	public Child(int a)
	{
		this();
		System.out.println(" child 1 para constructor");
	}
	public Child(int a,int b)
	{
		super(1,2);
		System.out.println("child 2 para constructor");
	}
	public Child(int a,int b,int c)
	{
		this(1);
		System.out.println("child 3 para constructor");
	}
	public void m5()
	{
		System.out.println("Child default method");
	}
	public void m5(int a)
	{
		super.m1(1,2,3);
		super.m1();
		super.m1(1,2);
		super.m1(1);
		this.m5(1,2,3);
		this.m5();
		this.m5(1,2);
		System.out.println("Child 1 para method");
	}
	public void m5(int a, int b)
	{
		System.out.println("Child 2 para method ");
	}
	public void m5(int a,int b,int c)
	{
		System.out.println("Child 3 para method");
	}

public static void main(String[] args)
	{
	 Child obj=new Child(1,2,3);
	 obj.m5(1);
	}

}
