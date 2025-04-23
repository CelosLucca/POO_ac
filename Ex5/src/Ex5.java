import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        float t, segundos, minutos, horas;


        System.out.println("Digite o tempo em segundos: ");
        t = teclado.nextFloat();

        segundos = t;
        minutos = t / 60;
        horas = t / 3600;

        System.out.println("O valor em horas é: " + horas);
        System.out.println("O valor em minutos é: " + minutos);
        System.out.println("O valor em segundos é: " + segundos);

    }
}
