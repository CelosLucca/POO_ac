import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int salario, percentual, aumento, novoSalario;

        System.out.println("O salário é: ");
        salario = teclado.nextInt();

        System.out.println("O percentual é: ");
        percentual = teclado.nextInt();

        aumento = salario * percentual / 100;

        novoSalario = salario + aumento;

        System.out.println("O novo salário é: " + novoSalario);
    }
}
