/*

 Pattern like 
 *
 **
 ***
 ****
 *****

 */
import java.util.*;
public class Patttern2  {
    public static void main(String x[]){
        Scanner sc=new Scanner(System.in);
        //Taking the input from the user
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        //Writting down the logic:
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
