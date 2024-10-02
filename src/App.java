import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);
        float valorSalario = entradas.nextFloat();
        float valorBeneficio = entradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05f * valorSalario;
        } else if (valorSalario >= 1100.01 && valorSalario <= 2500) {
            valorImposto = 0.10f * valorSalario;
        } else {
            valorImposto = 0.15f * valorSalario;
        }

        //Calcula e imprime a saida (com 2 casas decimais)
        float saida = valorSalario - valorImposto + valorBeneficio;
        System.out.printf("Saída: %.2f%n", saida);
    }
}
