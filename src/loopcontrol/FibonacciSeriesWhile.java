package loopcontrol;

public class FibonacciSeriesWhile {
    public static void main(String[] args) {
        int num = 10;
        int a = 0;
        int b = 1;
        int i = 1;
        int c;
        System.out.println("Fibonacci Series of " + num + " numbers : ");
        while (i <= num) {
            System.out.println(a+" ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
}
