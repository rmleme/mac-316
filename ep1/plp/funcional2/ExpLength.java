package plp.funcional2;
import plp.funcional2.memoria.*;

public class ExpLength extends ExpUnaria{

 public ExpLength(Expressao exp){
    this.setExpUnaria(exp,"length");
 }

 public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException{
    return new ValorInteiro (
                   ((ValorString)this.getExp().avaliar(ambiente)).valor().length());
 }

}