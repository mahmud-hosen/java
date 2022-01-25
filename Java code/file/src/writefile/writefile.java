
package writefile;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;




public class writefile {
    
    public static void main(String[]args){
        
        String id,name;
        
       
        
        try {
           
            
            Formatter fomatter = new  Formatter ("C:/Users/Mahmud/NewFoler");
            Scanner input= new Scanner(System.in);
            System.out.println("How many number you want ??");
            int num=input.nextInt();
            for(int i = 0;i<=num;i++){
                
                
                System.out.println("Enter student id and name");
                id=input.next();
                name=input.next();
                formatter.format("%s %s\r\n",id,name);
            }
            formatter.close(
            );
            
            
            
        } catch (FileNotFoundException e) {
           System.out.println(e);
        }
            
            
        
 }
}

