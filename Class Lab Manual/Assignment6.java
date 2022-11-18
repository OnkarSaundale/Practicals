
/*
 //Abstract class
//Question 1:
abstract class Instrument//parent class
{
	abstract void play();
	
}
class Piano extends Instrument//child class
{
	void play()
	{
		System.out.println("Play Piano");
	}
}
class Flute extends Instrument//child class
{
	void play()
	{
		System.out.println("Play Flute");
	}
}
class Guitar extends Instrument//child class
{
	void play()
	{
		System.out.println("Play Guitar");
	}
}
public class Assignment6 
{

	public static void main(String[] args)
	{
	//  Instrument ins = new Instrument(); because instrument is abstract class
	//	Instrument g = new Guitar();
	//	g.play();
		
		Instrument ins[]= new Instrument[3];
		ins[0]= new Piano();
		ins[1]= new Guitar();
		ins[2]= new Flute();
		
		//i[0].play();
		for (int i=0;i<3;i++)
		{
			ins[i].play();
		}
		System.out.println(" ");
		for(int i=0;i<3;i++)
		{

			 if(ins[i] instanceof Piano)
			 {
				 System.out.println("INdex of Piano is:"+ i);
			 }
			 else if(ins[i] instanceof Guitar)
			 {
				 System.out.println("Index of Guitar is:"+i);
			 }
			 else if(ins[i] instanceof Flute)
			 {
				 System.out.println("Index of Flute is:"+i);
			 }
		}

	}

}

//Question 2:
class Medicine//Parent class
{
	
	void displayLabel()
	{
		String Name,Address;
		Name="Bharat chemicals pvt.ltd";
		Address="Pimpri,pune";
		System.out.println("Drug Manufacturer Pharmaceutical company in pune:\n"+"Name="+Name+"\n"+"Address="+Address);
	}
}
class Tablet extends Medicine//child class 1
{
	void displayLabel()
	{
		System.out.println("Tablets should be store in dry place.");
	}
}
class Ointment extends Medicine
{
	void displayLabel()
	{
		System.out.println("Ointments are external use only");
	}
}
class Syrup extends Medicine
{
	void displayLabel()
	{
		System.out.println("Syrup can be taken twice a day");
	}
	
}

public class Assignment6 
{
	

	public static void main(String[] args)
	{
		Syrup s =new Syrup();
		s.displayLabel();
	}
}

package MyAssignments;
//Abstract class
//Question 3:

abstract class Shape
{
	abstract void area();
	
}
class Circle extends Shape
{
	@Override
	void area() 
	{
		
		System.out.println("Circle area is calculated!!");
	}
	
}
class Cylinder extends Shape
{
	@Override
	void area() 
	{
		System.out.println("Cylinder area is calculated!!");
	}
	
}
class Square extends Shape
{

	@Override
	void area() 
	{
		System.out.println("Square area is calculated!!");
		
	}
	
}
class Rectangle extends Shape
{

	@Override
	void area()
	{
		System.out.println("Rectangle area is calculated!!");
		
	}
	
}
class TestShape
{
	void print()
	{
		Shape s[] =new Shape[4];
		s[0]= new Circle();
		s[1]= new Cylinder();
		s[2]= new Square();
		s[3]= new Rectangle();
		for (int i=0;i<4;i++)
		{
			s[i].area();
		}
		
	}
	
	
}
public class Assignment6 
{
	

	public static void main(String[] args)
	{
		TestShape t = new TestShape();
		t.print();
	}
}












 */
