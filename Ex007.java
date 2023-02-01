import java.util.Scanner;

public class Ex007 {
    /* Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius  */
    public static void main(String[] args){
        try (Scanner temperatura = new Scanner(System.in)) {
            System.out.print("Entre com o valor da temperatura em graus Celsius(ºC) : ");
            double c = temperatura.nextDouble();

            double f = (9 * c + 160) / 5;

            System.out.printf("%nO valor da temperatura convertida em Fahrenheit(ºF): %.1f", f);
        }


    }
}
