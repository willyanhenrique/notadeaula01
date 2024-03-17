import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //num
        Scanner sc2 = new Scanner(System.in); // nom

        Funcionario f = new Funcionario();
        Folhapgto pg = new Folhapgto();
        System.out.println("Digite a Matrícula: ");
        f.Matricula = sc.nextDouble();
        System.out.println("Digite o nome: ");
        f.Nome = sc2.nextLine();
        System.out.println("Digite o seu Salário:");
        pg.Salariobruto = sc.nextDouble();

        System.out.println("Matrícula de número: "+ f.Matricula);
        System.out.println("Funcionário: "+f.Nome);
        System.out.println("Com salário bruto de: "+pg.Salariobruto);
        System.out.println("O desconto de INSS foi de:"+pg.descinss());
        System.out.println("O salário líquido foi de:"+pg.salarioliq());




    }
}