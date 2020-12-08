package plp.funcional2.memoria;
import plp.funcional2.*;

public class Context implements Ambiente{
  private ContextIdValor contextData;
  
  public Context() {  }

  public void incrementa(){
      if ( contextData == null ) contextData = new ListMap();
      else contextData = contextData.incrementa(); }
      
  public void restaura(){ contextData = contextData.restaura(); }

  public void map( Id idArg, Contextuavel valorId ) throws VariavelJaDeclaradaException{
    contextData.addId( idArg, valorId );  }

  public Contextuavel getValor( Id idArg ) throws VariavelNaoDeclaradaException{
      return contextData.getValor(idArg);}

  public String toString(){return "";}
}

