package plp.funcional2.memoria;
import plp.funcional2.*;

public interface ContextIdValor{
/* O nome correto deveria ser ContextIdContextuavel, pois a classe que implementa
esta interface deve mapear um Id em algum objeto Contextuavel (Valor,ValorFuncao)*/
  public ContextIdValor incrementa();
  public ContextIdValor restaura();
  public boolean hasMoreElements();
  public ContextIdValor nextElement();
  public void addId( Id idArg, Contextuavel valorArg ) throws VariavelJaDeclaradaException;
  public boolean exists( Id idArg );
  public Contextuavel getValor( Id idArg )throws VariavelNaoDeclaradaException;
}


