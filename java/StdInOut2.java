import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StdInOut2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int theInt = sc.nextInt();
        double theDouble = sc.nextDouble();
        sc.nextLine();
        String theString = sc.nextLine();
        
        System.out.println("String: " + theString);
        System.out.println("Double:" + theDouble);
        System.out.println("Int:" + theInt);
    }
}
