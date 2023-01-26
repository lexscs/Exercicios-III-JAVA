import java.util.Scanner;

public class Ex004 {
    /**
     * @param args
     */
    public static void main(String[] args){
        /* Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês */
        
        try (Scanner salario = new Scanner(System.in)) {
            String vendedor ="";
            float salarioFixo = 0;
            float vendasMes = 0;
            double comissao = 0.15;
            float salarioFinal = 0;

            System.out.print("Informe o nome do vendedor: ");
            vendedor = salario.nextLine();

            System.out.print("Agora informe o valor do salário fixo do vendedor(R$): ");
            salarioFixo = salario.nextFloat();

            System.out.print("Informe o total de vendas desse vendedor(R$): ");
            vendasMes = salario.nextFloat();

            salarioFinal = (float) (salarioFixo + (vendasMes * comissao));
            
            System.out.print("O vendedor " + vendedor);
            System.out.printf(" com o salário de R$ %.2f ", salarioFixo);
            System.out.printf("vai receber o valor de R$ %.2f já calculado sua comissão", salarioFinal);
        }
    }
}
