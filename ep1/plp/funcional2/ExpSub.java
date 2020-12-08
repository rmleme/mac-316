package plp.funcional2;
import plp.funcional2.memoria.*;

public class ExpSub extends ExpBinaria{

  public ExpSub(Expressao esq, Expressao dir) {
    this.setExpBinaria(esq,dir,"-");
  }

  public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException {
    return new ValorInteiro(
      ((ValorInteiro)this.getEsq().avaliar(ambiente)).valor() -
      ((ValorInteiro)this.getDir().avaliar(ambiente)).valor() );
  }

}