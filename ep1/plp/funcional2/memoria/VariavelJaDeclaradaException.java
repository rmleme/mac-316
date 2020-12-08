package plp.funcional2.memoria;
import plp.funcional2.*;
public class VariavelJaDeclaradaException extends Exception{
  public VariavelJaDeclaradaException(Id id){
    super("Variavel " + id + " ja declarada.");
  }
}
