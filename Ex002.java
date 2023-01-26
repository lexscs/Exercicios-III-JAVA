import java.util.Scanner;

public class Ex002 {
    /* Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos dois números lidos */
    public static void main(String[] args){

        int n1, n2, soma, multi, sub, div;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o primeiro número: ");
            n1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            n2 = scanner.nextInt();
            soma = n1 + n2;
            multi = n1 * n2;
            sub = n1 - n2;
            div = n1 / n2;
        
            System.out.printf("%nO resultado da soma dos números é: %d", soma);
            System.out.printf("%nO resultado da multiplicação dos números é: %d", multi);
            System.out.printf("%nO resultado da subtração dos números é: %d", sub);
            System.out.printf("%nO resultado da divisão dos números é: %d", div);
        } 
        catch(Exception ex)
        {}
    }
}

