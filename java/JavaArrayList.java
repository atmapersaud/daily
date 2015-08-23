import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<ArrayList<Integer>> nums = new ArrayList<ArrayList<Integer>>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            
            int d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }
            
            nums.add(row);
        }

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(nums.get(x-1).get(y-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }

        }
        
    }
}
