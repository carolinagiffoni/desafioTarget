import java.util.Scanner;

public class InvertString {
    public static String invert(String texto) {

        String resultado = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            resultado += texto.charAt(i);
        }
        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = input.nextLine();
        String resultado = invert(texto);
        System.out.println("A string invertida é: " + resultado);
    }
}

