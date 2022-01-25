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
public class student extends person{
    
    String qlt;     
    @Override
         void display()
    {
        System.out.println("Name="+name);
        System.out.println("ID="+id);
        System.out.println("glt="+qlt);
        
        
    }
    }
    

