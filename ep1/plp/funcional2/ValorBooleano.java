package plp.funcional2;

import plp.funcional2.memoria.*;

public class ValorBooleano implements Valor{

  private boolean valor;

  public ValorBooleano(boolean valor) { this.valor = valor;}

  public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException {
    return this;
  }
  public ListaValorFuncao avaliarchamadodeaplicacao(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException {
    return new ListaValorFuncao();
  }

  public boolean valor(){ return valor;}

  public boolean equals(Valor obj){ return valor == ((ValorBooleano) obj).valor();}

  public String toString(){ return String.valueOf(valor);}

}