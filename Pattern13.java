/*
Pattern like:
 1      1
 12    21
 123  321
 12344321

 */
import java.util.*;
public class Pattern13 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number:");
            int n=sc.nextInt();
            System.out.println();
            //logic
            int space=2*(n-1);
            for(int i=1;i<=n;i++){
                //number
                for(int j=1;j<=i;j++){
                    System.out.print(j);
                }
                //space
                for(int j=1;j<=space;j++){
                    System.out.print(" ");
                }
                //number
                for(int j=i;j>=1;j--){
                    System.out.print(j);
                }
                System.out.println();
                space=space-2;
            }

        }
    }
}
