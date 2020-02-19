package Pkg2;
import java.util.Scanner;
public class Scanclass
{
public int sub(int a,int b)
{
	int A=(a-b);
	return A;
}
public int sum(int a,int b)
{
	int A=(a+b);
	return A;
}
public int mul(int a,int b)
{
	int A=(a*b);
	return A;
}
public void div(int a,int b)
{
	int A=(a/b);
	System.out.println("Result of expression (((((X1-X2)+X3)*X4)+X5)/X6) is "+A);
}
public static void main(String[] args) {
	System.out.println("Enter values for (((((X1-X2)+X3)*X4)+X5)/X6) X1,X2,X3,X4,X5,X6");
	Scanner ref=new Scanner(System.in);
	int X1=ref.nextInt();
	int X2=ref.nextInt();
	int X3=ref.nextInt();
	int X4=ref.nextInt();
	int X5=ref.nextInt();
	int X6=ref.nextInt();
	//
Scanclass obj= new Scanclass();
	int P=obj.sub(X1,X2);
	int q=obj.sum(P,X3);
	int r=obj.mul(q,X4);
	int s=obj.sum(r,X5);
	obj.div(s,X6);
	}
}
