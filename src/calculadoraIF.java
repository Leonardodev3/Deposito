import java.util.Scanner;

public class calculadoraIF {
    public static void main(String[] args) {
        float nota1;
        float nota2;
        float nota3;

        System.out.println("Média de notas:");

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        nota1 = scan.nextFloat();

        System.out.println("Digite a segunda nota:");
        nota2 = scan.nextFloat();

        System.out.println("Digite a terceira nota:");
        nota3 = scan.nextFloat();

        float result = (nota1 + nota2 + nota3)/3;
        System.out.printf("Sua nota foi de: " + "%.2f%n", result);

        if (result > 0){
            if (result >= 7){
                System.out.println("Parabéns, você foi Aprovado!");
            }else if (result < 5){
                System.out.println("Você foi Reprovado!");
            }else if (result >=5){
                System.out.println("Você está de Recuperação!");
            }
        }else{
            System.out.println("Você não possuí nota!");
        }
        scan.close();
    }
}
