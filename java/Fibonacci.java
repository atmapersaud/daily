public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(Integer.parseInt(args[0])));
        //System.out.println(Integer.toHexString(255));
    }

    public static int fib(int n) {
        int[] fibs = new int[n+1];
        fibs[0] = 0;
        fibs[1] = 1;
        for (int i = 2; i < n+1 ; i++) {
            fibs[i] = fibs[i-1] + fibs[i-2];
        }
        return fibs[n];
    }
}
