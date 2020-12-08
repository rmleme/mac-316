package plp.funcional2;
import plp.funcional2.memoria.*;

public interface Expressao {
  public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException;
  public ListaValorFuncao avaliarchamadodeaplicacao(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException;
  /* Esta fun��o foi necess�ria por causa do casamento de padr�es. No avaliar da aplica��o,
     para termos casamento de padr�es, precisamos de uma lista de valores-fun��o para comparar
     com o argumento, da� a necessidade de a fun��o avaliar chamada dentro de aplica��o retornar
     uma lista. */
}