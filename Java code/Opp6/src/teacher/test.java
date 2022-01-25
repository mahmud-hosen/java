
package teacher;

import java.util.Scanner;


public class test {
    
    
    public static void main(String[]args)
    {
        
        Scanner input=new Scanner(System.in);
        
        
        System.out.println("Enter Name");
        String name=input.nextLine();
        System.out.println("Enter Rool");
        String rool=input.nextLine();
        System.out.println("Enter ID");
        String id=input.nextLine();
        
        
        student a=new student();
        a.information("name", "rool", "id");
       a.display();
        student b=new student();
        b.information("name", "rool", "id");
        b.display();
        student c=new student();
        c.information("name", "rool", "id");
        c.display();
        student d=new student();
        d.information("name", "rool", "id");
        d.display();
        
        
        
        
    }
        
    
    
    
    
}
