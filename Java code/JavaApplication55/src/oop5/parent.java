
package oop5;


public class parent {
    
    
     String name,rool;
      int id;
      
      void information(String a,String r,int i)
      {
          name=a;
          rool=r;
          id=i;
          
      }
      void display(){
    
       System.out.println("Name= "+name);
       System.out.println("Rool= "+rool);
       System.out.println("ID= "+id);
    }
    
}
