/*
pattern like
**** 
****
****
****
 */

 import java.util.*;
 class pattern1{
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
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
