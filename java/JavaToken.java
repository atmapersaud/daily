import java.util.Scanner;

public class JavaToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inString = sc.nextLine();

        String[] tokens = inString.split("[!,?._'@ ]+");

        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
