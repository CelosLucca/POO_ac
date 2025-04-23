import java.util.Scanner;

public class Ex1    {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = teclado.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = teclado.nextInt();

        System.out.println("Soma = " + (num1 + num2));
        System.out.println("Subtração = " + (num1 - num2));
        System.out.println("Divisão = " + (num1 / num2));
        System.out.println("Multiplicação = " + (num1 * num2));


    }

}
