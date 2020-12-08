package plp.funcional2;
import plp.funcional2.memoria.*;

public class ValorFuncao implements Valor{
  private ListaId arg;
  private ListaValor valorArg;
  private Expressao exp;
  /* Por causa do casamento de padrões, agora um ValorFuncao pode conter, em vez de uma lista
     de identificadores, uma lista de valores, para os quais a função valerá exp. */

  public ValorFuncao(ListaId a, Expressao e) {
      arg=a;
      exp=e;
      valorArg=null;
  }
  public ValorFuncao(ListaValor a, Expressao e) {
      arg=null;
      exp=e;
      valorArg=a;
  }

  public ListaId getListaId() { return arg; }
  public ValorFuncao setListaId(ListaId l) { arg = l; return this; }
  public Expressao getExp() { return exp; }
  public ValorFuncao setExp(Expressao e) { exp = e; return this; }
  public ListaValor getValorArg() { return valorArg; }

  public ValorFuncao valor() {return this;}

  public boolean equals(Valor valor){
    return (((ValorFuncao)valor).getListaId() == this.arg &&
            ((ValorFuncao)valor).getExp() == this.exp);
  }

  public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException{
    return this;
  }

  public ListaValorFuncao avaliarchamadodeaplicacao(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException {
    return new ListaValorFuncao(this);
  }
}