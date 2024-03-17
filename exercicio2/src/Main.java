import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);
        Media m=new Media();

        System.out.println("Digite seu nome:");
        m.nome=sc.next();
        System.out.println("Digite primeira nota:");
        m.nota1=sc2.nextInt();
        System.out.println("Digite segunda nota:");
        m.nota2=sc2.nextInt();



        System.out.println(m.mediatotal());
    }
}