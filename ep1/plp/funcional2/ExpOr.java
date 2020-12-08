package plp.funcional2;
import plp.funcional2.memoria.*;
public class ExpOr extends ExpBinaria{

 public ExpOr(Expressao esq, Expressao dir){
    this.setExpBinaria(esq,dir,"Or");
 }

 public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException{
     if (((ValorBooleano)getEsq().avaliar(ambiente)).valor())
       return new ValorBooleano(true);
     else
       return new ValorBooleano(((ValorBooleano)getDir().avaliar(ambiente)).valor());
 }
}
