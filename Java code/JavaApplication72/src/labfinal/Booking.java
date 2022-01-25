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
public class Booking {
    
    public int Booking;
    Data=CheckInData;
    hotel h;
    Customer c;
    public int Duration;
    public boolean makeBooking(int b,hotel h,Customer c)
    {
        Booking Id=b;
        boolean p;
        h.HotelNumber=20;
        h.HotelName="HH";
        h.Adress="Dhaka";
        h.TotalNumberofRooms=100;
        c.Fullname="Mahmud";
        c.phonenumber="0178";
        c.Adress="Dhaka";
        
        
        return false;
        
        
        
    }
    
    
    
    
    public  static void main(String[]args)
    {
     
        
        Customer ob2=new Customer("oo","uu","tt");
        System.out.println(ob2.toString());
        hotel ob1= new hotel(10,"jjj","tttt",30);
        ob1.toString();
        
        Booking ob=new Booking();
        ob.makeBooking(30, ob1, ob2);
                
    }
}
