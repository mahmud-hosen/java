public class teacher {
    
    String name,gender;
    int phone;
     teacher()
     {
         System.out.println("No value");
     }
     
    teacher(String n,String g,int p)
    {
        
        
        name=n;
        gender=g;
        phone=p;
    }
    
 void displayinformation()
 {
 
     System.out.println(""+name);
     System.out.println(""+gender);
     System.out.println(""+phone);
     
 }
    
    
    
    
    
}
