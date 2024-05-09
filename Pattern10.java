/*
 
  *
 ***
*****
 ***
  *
 
 */

import java.util.*;
public class Pattern10 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number:");
            int n=sc.nextInt();
            for(int i=0;i<n;i++){
                //space
                for(int j=0;j<n-i-1;j++){
                    System.out.print(" ");
                }
                //star
                for(int k=0;k<2*i+1;k++){
                    System.out.print("*");
                }
                //space
                for(int l=0;l<n-i-1;l++){
                    System.out.print(" ");
                }
                System.out.println();
            }
            for(int i=0;i<=n;i++){
                for(int k=0;k<i;k++){
                    System.out.print(" ");
                }
                for(int j=0;j<2*n-(2*i+1);j++){
                    System.out.printf("*");
                }
                for(int l=0;l<i;l++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
