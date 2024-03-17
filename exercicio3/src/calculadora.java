public class calculadora {


    int n1;
    int n2;

    public int soma(){
        int soma=n1+n2;
        return soma;

    }
    public int Subtracao(){
        int subtracao=n1-n2;
        return subtracao;

}
public int divisao(){
        int divisao = n1/n2;
        if (n1<n2)
            System.out.println("nao e possivel fazer a divisão!");
        return divisao;
}
public int mutiplicacao(){
        int mutiplicacao = n1*n2;
        return mutiplicacao;
}
}
