Class name
{
String name=”swathi”;
int age = 20;
}
Class Mark extends Name
{
int m1=30,m2=30,m3=30;
}
Class Student extends Mark
{
int total;
Void calc()
{
Total=m1+m2+m3;
}
Void show()
{
System.out.println(“\n NAME: “ +name+”\n AGE:”+age+”\n MARK1=”+m1+”\n MARK2=”+m2+”\n  MARK3=”+m3+”\n TOTAL:”+total);
}
}
Class Multilevelinheritance
{
Public static void main(string args[])
{
Student ob=new student();
Ob.calc();
Ob.show( );
}
}

//b
class GFG {
// Method m1 with 0 parameter.
	public void m1()
	{
		System.out.println("No parameter method");
	}
// Method m1 with 1 integer parameter.
	public void m1(int i)
	{
		System.out.println("Int Parameter");
	}

	// Method m1 with 1 string parameter.
	public void m1(String s)
	{
		System.out.println("String Parameter");
	}
}

// Main Class
public class Main {

	public static void main(String[] args)
	{
		// Creating object for GFG class.
		// g is object of GFG class.
		GFG g = new GFG();

		// Here, m1 called with string parameter.
		// m1(String s) method will be called.
		g.m1("A");
	}
}


