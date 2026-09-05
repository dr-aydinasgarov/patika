package Beginn;

public class RecursivFibonacci {
    static int f(int a){
        if (a == 1 || a == 2)
            return 1;

        return f(a-1) + f(a-2);
    }
    static void main(String[] args) {
        System.out.println(f(5));

    }

}

