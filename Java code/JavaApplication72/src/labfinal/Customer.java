/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labfinal;

/**
 *
 * @author Mahmud
 */
public class Customer {
    
    
    
    public String Fullname;
    public String phonenumber;
    public String Adress;
    Customer(String f,String p,String a){
        
        
      Fullname=f;
      phonenumber=p;
      Adress=a;
    }
    
    @Override
    public String toString()
    {
        
        return Fullname+""+phonenumber+""+Adress
    }
    
}
