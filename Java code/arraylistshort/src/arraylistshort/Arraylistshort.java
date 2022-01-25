
package arraylistshort;

import java.util.ArrayList;
import java.util.Collections;



public class Arraylistshort {

    
    public static void main(String[] args) {
        
        
        
        
        ArrayList<Integer>number=new ArrayList<>();
        number.add(20);
        number.add(10);
        number.add(-5);
        number.add(96);
        System.out.print(number);
        Collections.sort(number);
        System.out.println("Assending "+number);
         Collections.sort(number,Collections.reverseorder());
        
    }`
    
}
