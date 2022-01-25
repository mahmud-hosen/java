
package string1;


public class String1 {

   
    public static void main(String[] args) {
        
         String m1="Mahmud";
         String m2 =new String("Mahmud");
         int length=m1.length();
        System.out.println(m1);
        System.out.println(m2);
        System.out.println(length);
        if(m1.equals(m2))
        {
            System.out.println("Equal");
        }
        
        else
        {
            System.out.println("Not Equal");
        }
        
        
        
    }
    
}
