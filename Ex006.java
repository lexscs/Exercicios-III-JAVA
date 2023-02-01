import java.util.Scanner;

public class Ex006 {
    /* Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a possuir o valor da variável A. Apresentar os valores trocados  */
    /**
     * @param args
     */
    public static void main(String[] args){
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite um valor: ");
            int var1 = entrada.nextInt();

            System.out.print("Digite outro valor: ");
            int var2 = entrada.nextInt();

            int troca = 0;
            
            troca = var1;
            var1 = var2;
            var2 = troca;

            System.out.printf("%nA primeira variável, recebe o valor: %d, e a segunda variável: %d", var1, var2);
        }
    }
}
