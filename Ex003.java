import java.util.Scanner;

public class Ex003 {
    /* Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto */
    public static void main(String[] args) {

                
        try (Scanner entrada = new Scanner(System.in)) {
            double distTotal;
            double consMedio;
            double combGasto;


            System.out.print("Digite a distância percorrida: ");
            distTotal = entrada.nextDouble();

            System.out.print("Digite o total de combustível gasto:");
            combGasto = entrada.nextDouble();

            consMedio = distTotal / combGasto  ;

            System.out.printf("%nO consumo médio do automóvel foi: %.2f litros/Km percorridos", consMedio);
        }
        }
        
    }
