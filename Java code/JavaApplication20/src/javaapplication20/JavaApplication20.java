
package javaapplication20;

import java.util.Scanner;


public class JavaApplication20 {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        int[][]number=new int[3][3];
         
         for(int i=0;i<=2;i++){
             
             for(int j=0;j<=2;j++)
             {
                 System.out.printf("[%d][%d]=",i,j);
                 number[i][j]=input.nextInt();
             }
             }
              
             for(int i=0;i<=2;i++)
             {
                 for(int j=0;j<=2;j++)
                 {
                     System.out.printf(" %d ",number[i][j]);
                 }
                System.out.println();
                 }
}
}
