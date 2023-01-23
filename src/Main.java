/*
Question : Take input from user and print rectangular star pattern.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF COLUMN :");
        a = sc.nextInt();
        System.out.println("RESULT :");
        for (int i = 1; i <= a; i++){
            for (int j = i; j <= a; j++){
                System.out.print(j);
            }
            for (int k = 1; k <= i -1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}










