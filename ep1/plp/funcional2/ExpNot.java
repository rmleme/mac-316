package plp.funcional2;
import plp.funcional2.memoria.*;

public class ExpNot extends ExpUnaria{

  public ExpNot( Expressao exp){
    this.setExpUnaria(exp,"~");
  }

 public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException{
   return new ValorBooleano(
     ! ((ValorBooleano) getExp().avaliar(ambiente)).valor() );
 }

}