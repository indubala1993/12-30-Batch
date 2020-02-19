package Pkg2;
public class Class4 
{
	public void abc()
	{
		System.out.println("Default Method");	
	}
	public void abc(int a)
	{
		System.out.println("1 parameter");
	}
	public void abc(int a,int b)
	{
		System.out.println("2 parameter");
	}
	public void abc(int a, int b,int c)
	{
		System.out.println("3 parameter");
		this.abc();
		this.abc(1);
		this.abc(1,2,3,4);
		this.abc(1,2);
		}
	public void abc(int a,int b,int c, int d)
	{
		System.out.println("4 parameter");
	}
public static void main(String[] args)
{
	Class4 ref=new Class4();
	ref.abc(1,2,3);
}
	}

