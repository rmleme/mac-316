package plp.funcional2.memoria;
import plp.funcional2.*;
public class VariavelNaoDeclaradaException extends Exception{
  public VariavelNaoDeclaradaException(Id id){
    super("Variavel " + id + " nao declarada.");
  }
}
