import java.util.Scanner;

public class Operação {
  public static void main(String[] args) {
    Scanner scr = new Scanner(System.in);
    double numeroUm, numeroDois;

    System.out.println("Digite o primeiro número real: ");
    numeroUm = scr.nextDouble();

    System.out.println("Digite o segundo número real: ");
    numeroDois = scr.nextDouble();

    System.out.println("Agora digite qual o tipo de operação desejada.");
    System.out.println(
        "Digite + para adição; Digite - para subtração; Digite * para multiplicação; Digite / para divisão; Digite ^ para potenciação.");
    String escolha = scr.next();

    switch (escolha) {
      case "+":
        double soma = numeroUm + numeroDois;
        System.out.println("Você escolheu soma.");
        System.out.println("O resultado da soma dos números é: " + soma);
        break;

      case "-":
        double subtracao = numeroUm - numeroDois;
        System.out.println("Você escolheu subtração.");
        System.out.println("O resultado da subtração dos números é: " + subtracao);
        break;

      case "*":
        double multip = numeroUm * numeroDois;
        System.out.println("Você escolheu multiplicação.");
        System.out.println("O resultado da multiplicação dos números é: " + multip);
        break;

      case "/":
        double divisao = numeroUm / numeroDois;
        System.out.println("Você escolheu divisão.");
        System.out.println("O resultado da divisão dos números é: " + divisao);
        break;

      case "^":
        double potencia = Math.pow(numeroUm, numeroDois);
        System.out.println("Você escolheu potenciação.");
        System.out.println("O resultado da potenciação do primeiro pelo segundo número é: " + potencia);
        break;

      default:
        System.out.println("O símbolo da operação é inválido!");
    }
    scr.close();
  }
}
