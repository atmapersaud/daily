import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class JavaHashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<String> pairs = new HashSet<String>();

        int T = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < T; i++) {
            pairs.add(sc.nextLine());
            System.out.println(pairs.size());
        }
    }
}
