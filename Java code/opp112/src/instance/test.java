
package instance;


public class test {
    
    
    public static void main(String[]args){
        
        Animal a=new Animal();
        person p=new person();
        teacher t=new teacher();
        
        System.out.println(a instanceof Animal);
        System.out.println(p instanceof Animal);
        System.out.println(t instanceof person);
        System.out.println(p instanceof teacher);
        
        
    }
    
}
