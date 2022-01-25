
package numformat;

import java.text.DecimalFormat;

public class numformat {
    
    
    public static void main(String[]args){
        double x=56.2356;
        DecimalFormat ob= new DecimalFormat("0.00");
        System.out.println("x= "+ob.format(x));
    }
    
}
