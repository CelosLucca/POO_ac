import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float distancia, tempo, gasolina, velocidade, consumo;

        System.out.println("Digite a distância em km: ");
        distancia = teclado.nextFloat();
        System.out.println("Digite o tempo em horas: ");
        tempo = teclado.nextFloat();
        System.out.println("Digite a quantiade de gasolina em litros:  ");
        gasolina = teclado.nextFloat();

        velocidade = distancia/tempo;
        consumo = distancia/gasolina;

        System.out.println("A velocidade média é de: " + velocidade + "KM/h");
        System.out.println("O consumo foi de:" + consumo + "KM/l");

    }
}
