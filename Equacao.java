import java.util.Scanner;

public class Equacao {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o valor de A: ");
    double a = sc.nextDouble();

    System.out.println("Digite o valor de B: ");
    double b = sc.nextDouble();

    System.out.println("Digite o valor de C: ");
    double c = sc.nextDouble();

    if (a == 0 && b == 0 && c != 0) {
      System.out.println("Coeficientes informados incorretamente.");
    } else if (a == 0 && b != 0) {
      double x = -c / b;
      System.out.println("Essa é uma equação de primeiro grau");
      System.out.printf("A raiz real da equação é: %.2f\n", x);
    } else {
      double delta = b * b - 4 * a * c;
      if (delta < 0) {
        System.out.println("Esta equação não possui raízes reais");
      } else if (delta == 0) {
        double x = -b / (2 * a);
        System.out.println("Esta equação possui duas raízes iguais");
        System.out.printf("Raiz: %.2f\n", x);
      } else if (delta > 0) {
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("Esta equação possui duas raízes reais diferentes.");
        System.out.printf("Raiz 1: %.2f\n", x1);
        System.out.printf("Raiz 2: %.2f\n", x2);
      }
      sc.close();
    }
  }
}
