package demo;


public class Assignment
{
	
public void m1() 

{
	
	this.m4(1,1,1);
	System.out.println("This is default method");
	
}

public void m2(int a) 

{
	this.m1();
	System.out.println("This is one parameterized method");
	
}
public void m3(int a, int b) 

{
this.m2(22);
	System.out.println("This is two parameterized method");
}
public void m4(int a, int b, int c) 

{
System.out.println("This is three parameterized method");
}
public void m5(int a, int b, int c, int d) 

{
this.m3(11, 22);
	System.out.println("This is four parameterized method");
}

public static void main(String[] args) 
{
	Assignment obj=new Assignment();
obj.m5(1,1,1,1);

}
}