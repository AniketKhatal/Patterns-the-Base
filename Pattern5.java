/*

 Patterns  like:
* * * * 
* * *
* *
*

 */
import java.util.*;
public class Pattern5 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number:");
            int n=sc.nextInt();
            for(int i=n;i>0;i--){
                /*you can also do like
                for(int i=1;i<=n;i++){
                    for(int j=0;j<n-1-i;j++)
                }
                */
                for(int j=i;j>0;j--){
                    System.out.printf("* ");
                }
                System.out.println();
            }
        }
    }
}
