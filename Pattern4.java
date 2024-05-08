/*
 pattern like:
 1
 22
 333
 4444
 55555
 */

 import java.util.*;
public class Pattern4 {
    public static void main(String x[]){
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the Number:");
            int n=sc.nextInt();
            //writting the logic
            //for row
            for(int i=0;i<=n;i++){
                //for column
                for(int j=1;j<=i;j++){
                    System.out.printf("%d",i);
                }
                System.out.println();
            }
        }
    }
}
