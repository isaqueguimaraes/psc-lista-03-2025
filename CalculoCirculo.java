import java.util.Scanner;

public class CalculoCirculo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Escolha o tipo de operação que você deseja fazer:");
    System.out.println(
        "Digite 1 para calcular o perímetro do círculo; Digite 2 para calcular a área do círculo; Digite 3 para calcular o volume da esfera.");
    int tipo = sc.nextInt();

    switch (tipo) {
      case 1:
        System.out.println("Digite o valor do raio do círculo: ");
        double raioUm = sc.nextDouble();
        double perimetro = 2 * Math.PI * raioUm;
        System.out.printf("O perímetro é: %.2f\n", perimetro);
        break;

      case 2:
        System.out.println("Digite o valor do raio do círculo: ");
        double raioDois = sc.nextDouble();
        double area = Math.PI * (raioDois * raioDois);
        System.out.printf("A área é: %.2f\n", area);
        break;

      case 3:
        System.out.println("Digite o valor do raio da esfera: ");
        double raioTres = sc.nextDouble();
        double volume = (4 / 3) * Math.PI * (raioTres * raioTres * raioTres);
        System.out.printf("O volume é: %.2f\n", volume);
        break;

      default:
        System.out.println("Operação inválida!");
        break;
    }
    sc.close();
  }
}
