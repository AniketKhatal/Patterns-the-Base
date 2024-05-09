/*
 12345
 1234
 123
 12
 1
 */

 import java.util.*;
public class pattern6 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            //Taking the input from the user:
            System.out.println("Enter the number");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i+1;j++){
                    System.out.printf("%d",j);
                }
                System.out.println();
            }
        }
    }
}
