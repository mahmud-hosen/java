
package sumofstring;



public class Sumofstring {

    
    public static void main(String[] args) {
        
        String m1="Mahmud";
        String m2=" Hasan";
        String fullname=m1+m2;
        System.out.println(fullname);
        
        String upper=fullname.toUpperCase();
        String lower=fullname.toLowerCase();
        System.out.println(upper);
        System.out.println(lower);
        boolean b=m1.startsWith("M");
        System.out.println(b);
        boolean m=m2.endsWith(" x");
        System.out.println(m);
        
        
    }
    
}
