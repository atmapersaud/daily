import java.util.Scanner;

public class Java1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            int subsum = 0;
            for (int j = i; j < n; j++) {
                subsum += nums[j];
                if (subsum < 0) {
                    count++;
                }
            }
        }
        
        System.out.println(count);

    }
}
