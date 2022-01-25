
package array1;

import java.util.Arrays;


public class Array1 {

    
    public static void main(String[] args) {
        
        int[]number={-1,-5,10,50,90,40,100,500,-3,91};
        
    Arrays.sort(number);
    for(int i=0;i<10;i++)
    {
    System.out.printf(" %d ",number[i]);
    
}
    
     System.out.printf("\n");
    for(int i=9;i>0;i--)
    {
    
        System.out.printf("  "+number[i]);
    
    }
    
    
    System.out.printf("\n");
    String[] names={"pinky","nilo","sujon","anis"};
    for(int i=0;i<4;i++)
    {
    
        System.out.printf("  \n"+names[i]);
    }
    for(int i=3;i>=0;i--)
    {
    
        System.out.printf("  \n"+names[i]);
    }
}
}
