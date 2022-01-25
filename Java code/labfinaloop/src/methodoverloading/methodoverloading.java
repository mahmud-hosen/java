
package methodoverloading;

/**
 *
 * @author Mahmud
 */
public class methodoverloading {
    
    void add(double a,double b)
    {
        
      System.out.printf("sum = %f\n ",a+b);
    }
    void add(int a,int b)
    {
        
      System.out.printf("sub = %d\n ",a-b);
    }
    void add(int a,int b,int c)
    {
        
      System.out.printf("mul = %d\n ",a+b+c);
    }
    void add(float a,float b)
    {
        
      System.out.printf("div = %f \n",a/b);
    }
    
}
