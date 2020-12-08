package plp.funcional2;
import plp.funcional2.memoria.*;

public interface Expressao {
  public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException, VariavelJaDeclaradaException;
  public ListaValorFuncao avaliarchamadodeaplicacao(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException;
  /* Esta função foi necessária por causa do casamento de padrões. No avaliar da aplicação,
     para termos casamento de padrões, precisamos de uma lista de valores-função para comparar
     com o argumento, daí a necessidade de a função avaliar chamada dentro de aplicação retornar
     uma lista. */
}