import java.util.Scanner;
public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        calculadora ca = new calculadora();

        System.out.println("Bem vindo ao calculador de media do aluno");
        while (ca.repetir.equalsIgnoreCase("S")){
            System.out.println("Insira uma nota do aluno:");
            ca.numero = sc.nextDouble();
            ca.somatoria += ca.numero;
            System.out.println("Digite 'S' para sim ou 'N' para não:");
            ca.repetir = sc2.nextLine();

        }
        System.out.println("Media das notas"+ ca.medianova());
        System.out.println("Obrigado por utilizar o programa!");






}
}
