import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.println("Digite um numero: ");
        n = teclado.nextInt();

        if (n % 2 == 0) {
            System.out.println("O valor é par!");
        }
        else {
            System.out.println("O valor é impar!");
        }

    }
}
