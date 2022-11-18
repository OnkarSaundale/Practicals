package MyAssignments;

import java.util.Scanner;

//Question 2:
interface MyMath
{
	double sqr(double a);
	/*double cube(double a);
	double cosine(double a);
	double sine(double a);*/
	
}
class ImplMath implements MyMath
{
  
   
	@Override
	public double sqr(double a) {
		a= a*a;
		return a;
	}

	public double cube(double a) {
		a=a*a*a;
		return a;
	}

	/*public double cosine(double a) {
		a=cosine(a);
		return a;
	}


	public double sine(double a) {
		a=sine(a);
		return a;
	}*/
  
	
}

public class Assignment7 {

	public static void main(String[] args) 
	{
		double a,b,c,d,e,f;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		a=sc.nextDouble();
		
		ImplMath m = new ImplMath();
		b= m.sqr(a);
		System.out.println("Sqr:"+ b);
		
		c=m.cube(a);
		System.out.println("Cube:"+ c);
		
		/*d= m.sine(a);
		System.out.println("Sine:"+ d);
		
		e= m.cosine(a);
		System.out.println("Cosine:"+ e); */
	}

}


/*
 * //Question 1:
interface Relational
{
	void greaterThan();
	void lessThan();
	//void Thaneq();
	//void lessThaneq();
}
class ImplRel implements Relational
{
	int a,b;
	public ImplRel(int a,int b) 
	{
		this.a=a;
		this.b=b;
		
	}
	@Override
	public void greaterThan() {
		if(a>b)
		{
			System.out.println(a+" is greater than "+b);
		}
		
	}
	@Override
	public void lessThan() {
		if(a<b)
		{
			System.out.println(a+" is less than "+b);
		}
		
	}

}
public class Assignment7 {

	public static void main(String[] args) 
	{
		ImplRel r = new ImplRel(5, 3);
		
		r.greaterThan();
		r.lessThan();

	}

}
 */
