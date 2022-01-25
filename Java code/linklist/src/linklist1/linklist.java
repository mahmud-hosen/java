
package linklist1;

import java.util.LinkedList;


public class linklist {
    
    
    
    public static void main(String[]args)
    {
        
        LinkedList<String> country = new LinkedList<String>();
        country.add("bangladesh");
        country.add("India");
        country.add("Pakistan");
        country.add("Mayanmer");
        country.add("Botamn");
        country.add(5, "Singapur");
        country.addFirst("coria");
        country.addLast("sodan");
        country.removeLast();
        country.
        
        for(String country1 :country)
        {
            System.out.println(country1);
        }
        System.out.println("Size = "+country.size());
        country.clear();
        System.out.println(country);
        
    }
}


