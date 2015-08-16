import java.util.Scanner;

public class Datatypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < T; i++) {
            String numString = sc.nextLine();
            try {
                long numLong = Long.parseLong(numString);
                
                System.out.println(numString + " can be fitted in:");
                if (numLong >= Byte.MIN_VALUE && numLong <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (numLong >= Short.MIN_VALUE && numLong <= Short.MAX_VALUE) {
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (numLong >= Integer.MIN_VALUE && numLong <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                    System.out.println("* long");
                } else {
                    System.out.println("* long");
                }                
            } catch (Exception e) {
                System.out.println(numString + " can't be fitted anywhere.");
            }
        }
    }
}
