package runtimeanalysis.recursivevsIterativefibonaccicomputation;

public class FibonacciComputation {
    public static double recursiveFibonacci(int number){
        if(number == 0 || number == 1){
            return number;
        }
        return recursiveFibonacci(number-1)+recursiveFibonacci(number-2);
    }

    public static double iterativeFibonacci(int number){
        int a = 0;
        int b = 1;
        for (int i=2; i<=number; i++){
            int sum = a+b;
            a = b;
            b = sum;
        }
        return b;
    }
    public static void main(String[] args) {
        long st = System.nanoTime();
        double res = recursiveFibonacci(10);
        long et = System.nanoTime();
        System.out.println("Performance timing for Recursive Fibonacci(10): "+(et-st));

        st = System.nanoTime();
        res = iterativeFibonacci(10);
        et = System.nanoTime();
        System.out.println("Performance timing for Iterative Fibonacci(10): "+(et-st));
        System.out.println();

        st = System.nanoTime();
        res = recursiveFibonacci(30);
        et = System.nanoTime();
        System.out.println("Performance timing for Recursive Fibonacci(30): "+(et-st));

        st = System.nanoTime();
        res = iterativeFibonacci(30);
        et = System.nanoTime();
        System.out.println("Performance timing for Iterative Fibonacci(30): "+(et-st));
        System.out.println();

        st = System.nanoTime();
        res = recursiveFibonacci(50);
        et = System.nanoTime();
        System.out.println("Performance timing for Recursive Fibonacci(50): "+(et-st));

        st = System.nanoTime();
        res = iterativeFibonacci(50);
        et = System.nanoTime();
        System.out.println("Performance timing for Iterative Fibonacci(50): "+(et-st));
    }
}
