import java.util.Random;
import java.util.Scanner;

public class Sorteio {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    Random sorteio = new Random();

    System.out.println("Digite o primeiro número inteiro: ");
    int numeroUm = leitura.nextInt();

    System.out.println("Digite o segundo número inteiro: ");
    int numeroDois = leitura.nextInt();

    int menor = Math.min(numeroUm, numeroDois);
    int maior = Math.max(numeroDois, numeroDois);

    int sorteado = sorteio.nextInt(maior - menor + 1) + menor;

    if (sorteado % 2 == 0) {
      System.out.print("O número sorteado foi: " + sorteado);
      System.out.print(". Este é um número par.");
    } else {
      System.out.print("O número sorteado foi: " + sorteado);
      System.out.print(". Este é um número ímpar.");
    }
    leitura.close();
  }
}
