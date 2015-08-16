import java.util.Scanner;

public class JavaStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fullString = sc.nextLine();
        int k = sc.nextInt();

        String minSub = "zzz";
        String maxSub = "AAA";

        for (int i = 0; i < fullString.length() - k + 1; i++) {
            String sub = fullString.substring(i, i+k);
            if (sub.compareTo(minSub) < 0) {
                minSub = sub;
            }
            if (sub.compareTo(maxSub) > 0) {
                maxSub = sub;
            }
        }

        System.out.println(minSub);
        System.out.println(maxSub);
    }
}
