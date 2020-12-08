package plp.funcional2;
import plp.funcional2.memoria.*;

public class ExpMenos extends ExpUnaria{

 public ExpMenos(Expressao exp){
     this.setExpUnaria(exp,"-");
 }

 public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException{
    return new ValorInteiro(
                - ((ValorInteiro)getExp().avaliar(ambiente)).valor()
    );
 }

}