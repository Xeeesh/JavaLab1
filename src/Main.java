
public class Main {
    public static void main(String[] args) {
        //Pereb();
        //System.out.print(fib(5));
        //fib_print(10);
        System.out.print(fact(3));
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

    /*
    public static String str_rev(String str) {
        int ln = str.length();

        return NewStr;
    }

     */

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
        int arr[] = new int[num - 2];
        for (int i = 0; i < num - 2; i++) {
            arr[i] = i + 2;
        }
        
        int i = 2;
        while (Math.pow(i, 2) < num) {

            i++;
        }

        return;
    }
}