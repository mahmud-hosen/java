
package exception;

import java.util.Scanner;


public class Exception {

    
    public static void main(String[] args) {
      while(true) {
          try{
          Scanner input= new Scanner(System.in);
          System.out.print("Please enter num1");
          int num1=input.nextInt();
          System.out.print("Please enter num2");
          int num2=input.nextInt();
          int result=num1/num2;
          System.out.print("Restlt : "+num1+"/"+num2+"="+result);
}
      catch(Exception e)
              {
              System.out.print("Exception "+e);
              System.out.print("You must enter.Please try again");
              }
    
}
}
}
