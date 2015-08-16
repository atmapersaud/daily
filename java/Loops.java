import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int term = a;
            for (int j = 0; j < n; j++) {
                term += b * (int) Math.pow(2, j);
                System.out.print(term + " ");
            }
            System.out.print("\n");
        }
        
    }
}
