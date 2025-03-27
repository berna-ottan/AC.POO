import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float salário, aumento;
        System.out.println("Qual o valor do salário? ");
        salário = teclado.nextFloat();
        System.out.println("Qual o aumento? (%) ");
        aumento = teclado.nextFloat();

        System.out.println(" O valor do novo salário" + (salário + salário * aumento / 100 ));

    }
}
