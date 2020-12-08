package plp.funcional2;

import plp.funcional2.memoria.*;

public abstract class ExpUnaria implements Expressao{
 private Expressao exp;
 private String operador;

  public void setExpUnaria(Expressao e, String o) {
    exp=e;
    operador=o;
  }

  public Expressao getExp( ) {
    return exp;
  }
  public String getOperador() {
    return operador;
  }

  public ListaValorFuncao avaliarchamadodeaplicacao(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException {
      return new ListaValorFuncao();
  }

}