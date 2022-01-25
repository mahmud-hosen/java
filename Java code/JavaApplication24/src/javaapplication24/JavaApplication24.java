
package javaapplication24;

import java.util.Scanner;


public class JavaApplication24 {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][]num=new int[5][5];
        int[][]num1=new int[5][5];
        int[][]a=new int[5][5];
        System.out.printf("Enter array index number\n");
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
                    {
            System.out.printf("[%d][%d] : ",i,j);
            num[i][j]=input.nextInt();
        
               }
        }
                
    
    
    
    System.out.printf("Enter array index number\n");
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
                    {
            System.out.printf("[%d][%d] : ",i,j);
            num1[i][j]=input.nextInt();
        
               }
        }
    
       
        
    
    
    
for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                System.out.printf(" %d ",num[i][j]);
            }
            System.out.printf("\n");
           }

for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                System.out.printf(" %d ",num1[i][j]);
            }
            System.out.printf("\n");
           }


            for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
              a[i][j]=  num[i][j]+num1[i][j];
            }
            
           }
            
            
            
            System.out.printf("Sum of array number");
            for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                System.out.printf(" %d ",a[i][j]);
            }
            System.out.printf("\n");
           }
    }