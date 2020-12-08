package plp.funcional2;
import plp.funcional2.memoria.*;

public interface DeclaracaoFuncional {
  /*Foi necessario pois o contexto não tem autonomia para inclui
  no ContextData ou ContextFuncao, por isso cada DeclaracaoFuncional
  se mapeia*/
  public Id getID();
  public Valor getValor(AmbienteExecucao ambiente)  throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException;
}
