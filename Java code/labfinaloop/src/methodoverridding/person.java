/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverridding;

/**
 *
 * @author Mahmud
 */
public class person {
    
    String name,id;
    
    void information(String name,String id){
        
        this.name=name;
        this.id=id;
               
    }
    void display()
    {
        System.out.println("Name="+name);
        System.out.println("ID="+id);
    }
}
