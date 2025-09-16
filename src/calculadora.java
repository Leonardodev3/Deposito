import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) throws Exception {
        float numero1;
        float numero2;
        int operacao;
        
        System.out.println("Calculadora Gaymer");

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual operação você deseja fazer? \n 1.Adição \n 2.Subtração \n 3.Multiplicação \n 4.Divisão");
        operacao = scan.nextInt();

        System.out.println("Digite o primeiro numero: ");
        numero1 = scan.nextFloat();

        System.out.println("Digite o segundo numero: ");
        numero2 = scan.nextFloat();

        if (operacao == 1){
            float soma = numero1 + numero2;
            System.out.print("A soma é de: " );
            System.out.printf( "%.2f%n",soma);
            scan.close();
        } else {float sub = numero1 - numero2;
        float mult = numero1 * numero2;
        float div = numero1 / numero2;
        System.out.println("Você digitou os valores: " + numero1 + " e " + numero2 + " esses são os resultados:");

        
        System.out.print("A subtração é de: " );
        System.out.printf( "%.2f%n",sub);
        System.out.print("A multiplicação é de: " );
        System.out.printf( "%.2f%n",mult);
        System.out.print("A divisão é de: " );
        System.out.printf( "%.2f%n",div);
        }

        scan.close();

    }
}
