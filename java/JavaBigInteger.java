import java.util.Scanner;
import java.math.BigInteger;

public class JavaBigInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aString = sc.nextLine();
        String bString = sc.nextLine();

        BigInteger a = new BigInteger(aString);
        BigInteger b = new BigInteger(bString);

        BigInteger sum = a.add(b);
        BigInteger prod = a.multiply(b);

        System.out.println(sum);
        System.out.println(prod);
    }
}
