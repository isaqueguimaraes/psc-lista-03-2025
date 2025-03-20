import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    int numeroUm, numeroDois, numeroTres, maior, menor;
    double media;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    numeroUm = scanner.nextInt();

    System.out.println("Digite o segundo número: ");
    numeroDois = scanner.nextInt();

    System.out.println("Digite o terceiro número: ");
    numeroTres = scanner.nextInt();

    maior = Math.max(numeroUm, Math.max(numeroDois, numeroTres));
    menor = Math.min(numeroUm, Math.min(numeroDois, numeroTres));
    media = (numeroUm + numeroDois + numeroTres) / 3;

    System.out.println("O maior número digitado foi: " + maior);

    System.out.println("O menor número digitado foi: " + menor);

    System.out.println("A média dos números é: " + media);

    scanner.close();
  }
}
