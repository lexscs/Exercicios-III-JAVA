import java.util.Scanner;

public class Ex008 {
    /* Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário;  */
    
    /**
     * @param args
     */
    public static void main(String[] args){
        try (Scanner convertion = new Scanner(System.in)) {
            System.out.print("Entre com o valor para conversão (US$)): ");
            float dolar = convertion.nextFloat();
            System.out.print("Entre com o valor da cotação do dólar no dia(US$): ");
            float cotacao = convertion.nextFloat();
            System.out.print("Digite a quantidade de notas com o usuário: ");
            int qtde = convertion.nextInt();

            

            double valorConvertido = dolar * cotacao;

            System.out.printf("%nO cliente recebeu o valor de convertido (R$) %.2f, e tem quantidade notas %d ", valorConvertido, qtde);
        }



    }
}
