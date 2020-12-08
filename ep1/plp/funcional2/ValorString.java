package plp.funcional2;

import plp.funcional2.memoria.*;

public class ValorString implements Valor{

  private String valor;

  public ValorString(String valor){ this.valor = valor; }

  public boolean equals(Valor obj){ return valor.equals( ((ValorString) obj).valor());}

  public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException { return this; }
  public ListaValorFuncao avaliarchamadodeaplicacao(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException {
    return new ListaValorFuncao();
  }

  public String valor(){   return valor;  }
 
  public String toString(){ return valor; }

}