/*
 pattern like
 1
 12
 123
 1234
 12345
 */

 import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter the number:");
            int n=sc.nextInt();
            for(int i=0;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.printf("%d",j);
                }
                System.out.println();
            }
        }
    }
}
