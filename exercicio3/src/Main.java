import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String r;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        calculadora c=new calculadora();

        do {
            System.out.println("Digite(1) para soma! Digite(2) para subtração! Digite(3) para divisão! Digite(4) para mutiplicação:");
            int x = sc.nextInt();
            switch (x) {
                case 1:

                    System.out.println("Digite um numero:");
                    c.n1 = sc.nextInt();
                    System.out.println("Digite um numero:");
                    c.n2 = sc.nextInt();
                    System.out.println(c.soma());
                    break;
                case 2:
                    System.out.println("Digite um numero:");
                    c.n1 = sc.nextInt();
                    System.out.println("Digite um numero:");
                    c.n2 = sc.nextInt();
                    System.out.println(c.Subtracao());
                    break;
                case 3:
                    System.out.println("Digite um numero:");
                    c.n1 = sc.nextInt();
                    System.out.println("Digite um numero:");
                    c.n2 = sc.nextInt();
                    System.out.println(c.divisao());
                    break;
                case 4:
                    System.out.println("Digite um numero:");
                    c.n1 = sc.nextInt();
                    System.out.println("Digite um numero:");
                    c.n2 = sc.nextInt();
                    System.out.println(c.mutiplicacao());
                    break;

            }
            System.out.println("Digite (S) se quiser repetir e (N) para sair:");
            r =sc2.next();
            }while (r.equalsIgnoreCase("S"));
        }

    }


