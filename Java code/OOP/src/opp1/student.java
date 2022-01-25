
package opp1;


public class student {
    
    
    String name,gender,phone;
    
    
    
    void setinformation(String n,String m,String p)
    {
        name=n;
        gender=m;
        phone=p;
        
    }
    
    
    
    void displayinformation()
    {
        
        System.out.println(""+name);
        System.out.println(""+gender);
        System.out.println(""+phone);
    }
    
}
