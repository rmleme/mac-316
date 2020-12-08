package plp.funcional2;

import plp.funcional2.memoria.*;

public class DecFuncao implements DeclaracaoFuncional {
  private Id id;
  private ListaValorFuncao listaValorFuncao;
  // Agora temos uma lista de valores-função em vez de um só por causa do casamento de padrões.

  public DecFuncao(Id idFun, ListaValorFuncao lista){
      this.id = idFun;
      this.listaValorFuncao = lista;
  }

  public DecFuncao(Id idFun, ValorFuncao valorFuncao){
      this.id = idFun;
      this.listaValorFuncao = new ListaValorFuncao (valorFuncao);
  }

  public Id getID(){ return id; }

  public Valor getValor(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException {
      return listaValorFuncao;
  }
}