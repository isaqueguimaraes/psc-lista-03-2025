import java.util.Scanner;

public class MaquinaVendas {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.println("Por favor, digite qual o valor da sua compra: ");
    double valor = entrada.nextDouble();

    System.out.println("Ok, agora digite o valor pago: ");
    double pago = entrada.nextDouble();

    if (pago < valor) {
      System.out.println("Quantia insuficiente para o pagamento!");
    } else {
      double troco = pago - valor;
      System.out.printf("Seu troco é: R$ %.2f\n", troco);

      int trocoInt = (int) troco;

      int notas50 = trocoInt / 50;
      trocoInt = trocoInt % 50;

      int notas20 = trocoInt / 20;
      trocoInt = trocoInt % 20;

      int notas10 = trocoInt / 10;
      trocoInt = trocoInt % 10;

      int notas5 = trocoInt / 5;
      trocoInt = trocoInt % 5;

      int notas2 = trocoInt / 2;
      trocoInt = trocoInt % 2;

      int moedas1 = trocoInt;

      System.out.println("Notas de R$50: " + notas50);
      System.out.println("Notas de R$20: " + notas20);
      System.out.println("Notas de R$10: " + notas10);
      System.out.println("Notas de R$5: " + notas5);
      System.out.println("Notas de R$2: " + notas2);
      System.out.println("Moedas de R$1: " + moedas1);

      entrada.close();
    }
  }
}
