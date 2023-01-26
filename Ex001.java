import java.util.Scanner;;

public class Ex001 {
/* Faça um algoritmo que receba dois números e exiba o resultado da sua soma
 */

    public static void main(String[] args){

        int n1, n2, soma;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            n1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            n2 = scanner.nextInt();
            soma = n1 + n2;
            System.out.printf("O resultado da soma dos números é: %d", soma);
        } 
        catch(Exception ex)
        {}
    }
}


