package plp.funcional2;
import plp.funcional2.memoria.*;


public class DecVariavel implements DeclaracaoFuncional {
  private Id id;
  private Expressao expressao;

  public DecVariavel(Id idArg, Expressao expressaoArg){
      id = idArg;
      expressao = expressaoArg; }
      
  public Valor getValor(AmbienteExecucao ambiente)  throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException{
      return expressao.avaliar(ambiente);
  }
  public Id getID(){ return id; }
}
