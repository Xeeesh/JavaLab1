import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //str_rev("leps spel1");
        //Pereb();
        //System.out.print(fib(5));
        //fib_print(10);
        //System.out.print(fact(3));
        sep_print(30);
    }
    public static void iterate() {
        for (int a = 1; a <= 500; a++) {
            System.out.print(a);
            if (a % 5 == 0) {
                System.out.print("fizz");
            }
            if (a % 7 == 0) {
                System.out.print("bizz");
            }
            System.out.println();
        }
    }

    public static void str_rev(String str) {
        int ln = str.length() - 1;
        for(int i = ln; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        return;
    }

    public  static int[] fib(int num) {
        int[] fib_arr;
        fib_arr = new int[num];
        int a = 0, b = 1;
        fib_arr[0] = a; fib_arr[1] = b;
        for (int i = 2; i < num; i++) {
            fib_arr[i] = fib_arr[i - 1] + fib_arr[i - 2];
            //System.out.print();
        }

        return fib_arr;
    }

    public  static  void fib_print(int num) {
        int[] fib_arr;
        fib_arr = new int[num];
        int a = 0, b = 1;
        fib_arr[0] = a; fib_arr[1] = b;
        for (int i = 2; i < num; i++) {
            fib_arr[i] = fib_arr[i - 1] + fib_arr[i - 2];
            //System.out.print();
        }
        for (int i = 0; i < num; ++i) {
            System.out.println(fib_arr[i]);
        }
        return;
    }

    public  static int fact(int num) {
        int fact = 1;
        for(int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void sep_print(int num) {
        boolean[] isPrime = new boolean[num];
        Arrays.fill(isPrime, true);

        for (int i = 2; i * i < num; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j < num; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i < num; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
        return;
    }
}