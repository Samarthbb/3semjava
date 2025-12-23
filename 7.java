//a
import java.lang.*;
class Error2
{
public static void main(String args[])
{
int a=10;
int b=5;
int c=5;
int x,y;
try
{
 x=a/(b-c);
}
catch (ArithmeticException e)
{
System.out.println("division by zero");
}
 y=a/(b+c);
System.out.println("y=" +y);
}
}

//b
class BreakandContinue
{
public static void main(String args[])
    {
System.out.println("Break Statement\n....................");

for(int i=1;i<=5;i++)
        {
if(i==4) break;
System.out.println(i);
        }
System.out.println("Continue Statement\n....................");

for(int i=1;i<=5;i++)
        {
if(i==1) continue;
System.out.println(i);
        }	
    }
}

