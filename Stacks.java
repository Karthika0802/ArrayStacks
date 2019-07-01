import java.util.*;

public class Stacks {
   public static void main(String args[]) {

      // creating stack
      Stack stack = new Stack();
      Scanner sc = new Scanner(System.in); 
      System.out.println(""); 
      int Key = 5;
      while(Key!=0)
      {
          System.out.println("Press 1 to enter an operand, press 2 to enter an operator, press 3 to exit and print the current stack");           
          Key = sc.nextInt();
          
          if(Key == 1){
              
              System.out.println("Please enter your operand");
              stack.push(sc.nextInt());
              
          }
          
          if(Key == 2){
              
              System.out.println("Please enter your operator");
              char Operator = sc.next().charAt(0); 
              if(Operator == '+'){
                  
                  //stack.push(stack.pop()+stack.pop());
                  
                  
              }
              
              
          }
          
          
      
        }

      System.out.println(stack.pop());
    
      
      
      
   }     
}
