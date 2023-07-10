public final class Fibonacci {
    public static void main(String[] args) {

        //Returns value for n-number in the sequence, it works for n>=0

        int n = 14; //correct answer is 377
        System.out.println(Fib(n));

    }

    public static int Fib(int n){
        if (n==0) {
            return 0;
        }
        else if (n==1) {
            return 1;
        }
        else {
            return Fib(n-1) + Fib(n-2);
        }

    }
}
