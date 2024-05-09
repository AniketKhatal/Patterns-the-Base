/*

     ******     
     *****
     ****
     ***
     **
     *

 */
import java.util.*;
public class Pattern8 {
   public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the Number:");
            int n=sc.nextInt();

            for(int i=0;i<=n;i++){
                for(int k=0;k<n;k++){
                    System.out.print(" ");
                }
                for(int j=0;j<n-i+1;j++){
                    System.out.printf("*");
                }
                for(int l=0;l<n;l++){
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
   } 
}
