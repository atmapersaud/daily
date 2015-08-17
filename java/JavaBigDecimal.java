import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.util.Collections;

public class JavaBigDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        ArrayList<BigDecimal> decList = new ArrayList<BigDecimal>();

        while (sc.hasNext()) {
            String next = sc.nextLine();
            BigDecimal dec = new BigDecimal(next);
            decList.add(dec);
        }

        Collections.sort(decList, Collections.reverseOrder());
        
        for (BigDecimal d : decList) {
            System.out.println(d);
        }
    }
}
