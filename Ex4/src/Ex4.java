import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double raio, perimetro, area;

        System.out.println("Digite o raio do circulo: ");
        raio = teclado.nextDouble();

        perimetro = 2 * Math.PI * raio;
        System.out.println("O perimetro é: " + perimetro);

        area = Math.PI * Math.pow(raio, 2);
        System.out.println("A área é de: " + area);

    }
}
