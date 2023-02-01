import java.util.Scanner;

public class Ex005{
    /* Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. No final informar o nome do aluno e a sua média (aritmética); */
    public static void main(String[] args){

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Digite o nome do aluno: ");
            String nomeAluno = entrada.nextLine();

            System.out.print("Digite a primeira nota: ");
            double n1 = entrada.nextInt();

            System.out.print("Digite a segunda nota: ");
            double n2 = entrada.nextInt();

            System.out.print("Digite a terceira nota: ");
            int n3 = entrada.nextInt();


            double media = (n1 + n2 + n3) / 3;

            System.out.printf("Nome do aluno: %s %n", nomeAluno);
            System.out.printf("A média das notas: %.2f %n", media);
        }
    }
}