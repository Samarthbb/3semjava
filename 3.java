class MethodOverloadingExample {
 static int addition(int x, int y) {
      return x + y;
   }
  static double addition(int x, double y) {
      return x + y;
   }
 public static void main(String[] args) {
      int a = addition(8, 8);
      double b = addition(4, 5.2);
      System.out.println("addition of integers: " + a);
      System.out.println("addition of double values: " + b);
   }
}

//b
public class OverloadingExample2
{
   private int rollNum;
   OverloadingExample2()
   {
      rollNum =100;
   }
   OverloadingExample2(int rnum)
   {
      this();
      /*this() is used for calling the default  
       * constructor from parameterized constructor.
       * It should always be the first statement 
       * inside constructor body.
       */
      rollNum = rollNum+ rnum;
   }
   public int getRollNum() {
	  return rollNum;
   }
   public void setRollNum(int rollNum) {
	  this.rollNum = rollNum;
   }
   public static void main(String args[])
   {
	   OverloadingExample2 obj = new OverloadingExample2(12);
       System.out.println(obj.getRollNum());
    }
}
