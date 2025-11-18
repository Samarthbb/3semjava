import java.io.*; 
  
class Addition { 
      
    int sum = 0; 
      
    public int addTwoInt(int a, int b){ 
          
        
        sum = a + b; 
          
        
        return sum;  
    } 
      
} 
  class GFG { 
    public static void main (String[] args) { 
      
          
        Addition add = new Addition(); 
        
        int s = add.addTwoInt(1,2); 
        System.out.println("Sum of two integer values :"+ s); 
          
    } 
} 

//b
public class operators { 
    public static void main(String[] args) 
    { 
  
        int a = 5; 
        int b = -10; 
  
         
        System.out.println("a<<2 = "+ (a << 2)); 
  
        System.out.println("b>>2 = "+ (b >> 2)); 
  
        System.out.println("b>>>2 = "+ (b >>> 2)); 
    } 
} 

