package 剑指offer;

public class q10 {
    public static int fib2(int n) {
        int a = 0, b = 1, sum;
        for(int j = 0;j < n; j++) {
            sum = (a+b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    public static int fib(int n) {
        int a = 0, b = 1, sum;
        for(int i = 0; i < n; i ++){
            sum = (a + b )% 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }

    public static int numWays(int n){
        int a =1, b = 1, sum;
        for (int i = 0; i < n; i++) {
            sum = (a + b) % 1000000007;
            a=b;
            b=sum;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(fib(10));
        System.out.println(numWays(10));
    }
}
