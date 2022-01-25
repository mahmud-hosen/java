
package arraylist;
import java.util.ArrayList;

public class Arraylist {

   
    public static void main(String[] args) {
        
        
        ArrayList<Integer>num=new ArrayList<Integer>();
        System.out.println("Size = "+num.size());
        num.add(10);
        
        num.add(12);
        num.add(16);
        num.add(150);
        num.add(20);
        num.add(5, 400);
        System.out.println(num);
         System.out.println("Size = "+num.size());
         
         num.remove(1);
         System.out.println(num);
         //num.clear();
         //System.out.println(num);
           
         
         //boolean check=num.isEmpty();
         //System.out.println();
         
         boolean contain=num.contains(10);
         System.out.println(contain);
         
         int pos=num.indexOf(400);
         System.out.println(pos);
         num.set(3, 70);
         System.out.println(num);
         int x=num.get(0);
         System.out.println(x);
         
    }
    
}
