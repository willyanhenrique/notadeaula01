public class Folhapgto {

    double Salariobruto;
    double Inss = 1 - 0.15;

    double salarioliq;

    double descinss;

    public double salarioliq(){
        salarioliq = Salariobruto - descinss;
        return salarioliq;
    }
    public double descinss (){
      descinss  = Salariobruto * Inss;
      return descinss;
    }
}
