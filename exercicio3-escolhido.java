import java.util.Scanner;

public class CalculadoraSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salário bruto: ");
        float salarioBruto = scanner.nextFloat();

        System.out.print("Informe o adicional noturno: ");
        float adicionalNoturno = scanner.nextFloat();

        System.out.print("Informe as horas extras: ");
        float horasExtras = scanner.nextFloat();

        System.out.print("Informe os descontos: ");
        float descontos = scanner.nextFloat();

        float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        System.out.println("\nSalário Líquido: " + salarioLiquido);

        scanner.close();
    }
}
