package plp.funcional2.memoria;

import plp.funcional2.Id;
import plp.funcional2.Expressao;
import plp.funcional2.ValorFuncao;

public interface AmbienteExecucao extends Ambiente {

  public void mapValor( Id idArg, Expressao expressaoId) throws VariavelJaDeclaradaException;
  public Expressao getValor( Id idArg ) throws VariavelNaoDeclaradaException;

}
