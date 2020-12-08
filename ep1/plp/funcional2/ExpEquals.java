package plp.funcional2;
import plp.funcional2.memoria.*;

public class ExpEquals extends ExpBinaria{

  public ExpEquals(Expressao esq, Expressao dir){
    this.setExpBinaria(esq,dir,"==");
  }

  public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException{
     return (
       new ValorBooleano(this.getEsq().avaliar(ambiente).equals(this.getDir().avaliar(ambiente)))
     );
  }

}