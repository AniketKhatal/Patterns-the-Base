/*
 
Pattern like:
*
**
***
**
*

 */
import java.util.*;
public class Pattern11 {
   public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)){
      System.out.println("Enter the Number:");
      int n=sc.nextInt();
      //Writting the Logic
    //   for(int i=0;i<=n;i++){
    //     for(int j=0;j<i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //   }
    //   //logic for second half
    //   for(int i=n-1;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    //   }

    //Another logic
    for(int i=1;i<=2*n-1;i++){
        int stars=i;
        if(i>n) stars=2*n-i;   //for second half
        for(int j=1;j<=stars;j++){
            System.out.print("*");
        }
        System.out.println();
    }
      }  
    }
   }

