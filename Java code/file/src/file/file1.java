
package file;
import java.io.File;
public class file1 {
    
    public static void main(String[] args) {
       
        File ob = new File("C:/Users/Mahmud/NewFoler");
        ob.mkdir();
        String oblocation=ob.getAbsolutePath();
        System.out.println(oblocation);
        
        
        
    }
    
}
