package Pkg2;
public class Class3
{
	public Class3()
	{
		this(1,2,3);
		System.out.println("Default Constructor");
	}
	public Class3(int a)
	{
		this(1,2);
		System.out.println("one parametrized constructor");
	}
	public Class3(int b,int c)
	{
		this();
		System.out.println("two parametrized constructor");
	}
	public Class3(int d,int e,int f)
	{
		
		System.out.println("three parametrized constructor");
	}
public static void main(String[] args) 
{
	Class3 C=new Class3(1);	
}
}
