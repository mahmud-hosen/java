
package stingdemo3;

public class Stingdemo3 {

    
    public static void main(String[] args) {
        
        String country="Bangladeshismycountry";
        System.out.println("country");
        //Search charater
        char ch=country.charAt(0);
        System.out.println(ch);
        //search charater value
        int value=country.codePointAt(0);
        System.out.println(value);
        //charater position
        int pos=country.indexOf("is");
        System.out.println(pos);
        int pos2=country.lastIndexOf("o");
        System.out.println(pos2);
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
