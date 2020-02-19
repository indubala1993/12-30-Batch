package Pkg2;

public class Classa extends Class1
{
	int a=10,b=20,c;
	public  void Arithmetic()
	{
		c=a+b;
		System.out.println("sum is"+c);
	}
	public static void main(String[] args)
	{
		Classa obj=new Classa();
		obj.Arithmetic();

	}

}
