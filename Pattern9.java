/*
 
*********
 *******
  *****
   ***
    * 

 */
import java.util.*;
public class Pattern9 {
   public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the Number:");
            int n=sc.nextInt();

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
