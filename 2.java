class Conversion {
public static void main(String args[] ) {
byte b;
int i = 257;
double d = 323.142;
System.out.println("\nConversion of int to byte.");
b = (byte) i;
System.out.println("i and b " + i + " " + b);
System.out.println("\nConversion of double to int.");
i = (int) d;
System.out.println("d and i " + d + " " + i);
System.out.println("\nConversion of double to byte.");
b = (byte) d;
System.out.println("d and b " + d + " " + b);
}
}

//b
Class ForEach  {
Public static void main (string args[ ] ) {
Intnums [ ] = { 1, 2, 3, 4 , 5 , 6,  7, 8, 9, 10 };
Int sum=0;
For(int x : nums ) {
System.out.println(“value is : “+ x);
Sum += x;
}
System.out.println(“summation: “+sum);
}
}
