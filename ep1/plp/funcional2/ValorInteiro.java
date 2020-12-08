package plp.funcional2;

import plp.funcional2.memoria.*;

public class ValorInteiro implements Valor{
  private int valor;

  public ValorInteiro(int valor) {  this.valor = valor; }

  public int valor() {return valor;}

  public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException { return this;}
  public ListaValorFuncao avaliarchamadodeaplicacao(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException {
    return new ListaValorFuncao();
  }

  public boolean equals(Valor obj){ return valor == ((ValorInteiro) obj).valor(); }

  public String toString() {return String.valueOf(valor);}

}