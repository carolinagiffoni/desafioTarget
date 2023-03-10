
import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static ArrayList<Integer> fibonacci(int n) {

        int a = 0, b = 1;
        ArrayList<Integer> seq = new ArrayList<>();
        seq.add(a);
        seq.add(b);
        while (b < n) {
            int c = a + b;
            a = b;
            b = c;
            seq.add(b);
        }
        return seq;
    }

    public static String verificaFibonacci(int n) {

        ArrayList<Integer> seq = fibonacci(n);
        if (seq.contains(n)) {
            return "O número " + n + " pertence à sequência de Fibonacci: " + seq.toString();
        } else {
            return "O número " + n + " não pertence à sequência de Fibonacci.";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = input.nextInt();
        System.out.println(verificaFibonacci(numero));
    }
}
