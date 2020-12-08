package plp.funcional2;
import plp.funcional2.memoria.*;

public class ExpAnd extends ExpBinaria{

 public ExpAnd(Expressao esq, Expressao dir){
      this.setExpBinaria(esq,dir,"and");
 }

 public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException{
    if (!((ValorBooleano)this.getEsq().avaliar(ambiente)).valor())
     return new ValorBooleano(false);
   else
     return new ValorBooleano(((ValorBooleano)this.getDir().avaliar(ambiente)).valor());
 }
}
