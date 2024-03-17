public class Media {
    double nota1;
   double nota2;
    double nota3;
    double nota4;
    double mediatotal;
    
    String nome;
    public double mediatotal(){


       double  mediatotal=(nota1+nota2)/2;
       if (mediatotal>=7.0)
           System.out.println("Aluno esta aprovado!");
        else if (mediatotal>=4.0)
           System.out.println("Aluno esta em recuperação!");
           
       else
            System.out.println("Aluno esta reprovado!");


        return mediatotal;
    }
}
