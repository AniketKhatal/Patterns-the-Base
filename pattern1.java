/*
pattern like
**** 
****
****
****

RULES:
1.Fro the outer loop,count the no of lines
2.For the inner loop, focus on the column, and connect them somehow to the rows
3.
 */

 import java.util.*;
 class pattern1{
    public static void main(String x[]){
       try( Scanner sc=new Scanner(System.in);){
        System.out.println("Ener the number:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }
 }
