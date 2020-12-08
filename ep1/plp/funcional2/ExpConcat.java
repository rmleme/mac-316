package plp.funcional2;
import plp.funcional2.memoria.*;

public class ExpConcat extends ExpBinaria{

  public ExpConcat(Expressao esq, Expressao dir){
    this.setExpBinaria(esq,dir,"++");
  }

  public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException{
     return new ValorString(
                 ( (ValorString) this.getEsq().avaliar(ambiente)).valor() +
                 ( (ValorString) this.getDir().avaliar(ambiente)).valor() );
  }

}