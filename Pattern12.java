/*
 pattern like-
 1
 0 1
 1 0 1
 0 1 0 1
 1 0 1 0 1
 */
import java.util.*;
public class Pattern12 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
          System.out.println("Enter the number:");
          int n=sc.nextInt();
          int start=1;
          System.out.println();
          for(int i=0;i<n;i++){
             if(i%2==0) start=1;
             else start=0;
             for(int j=0;j<=i;j++){
                System.out.print(start+" ");
                start=1-start;
             }
             System.out.println();
          }  
        }
    }
}
