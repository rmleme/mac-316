package plp.funcional2;
import plp.funcional2.memoria.*;

public class ExpDeclaracao implements Expressao{
  SeqDec seqdecFuncional;
  Expressao expressao;

  public ExpDeclaracao(SeqDec d,Expressao expressaoArg){
      seqdecFuncional = d;
      expressao = expressaoArg;
  }

  public ExpDeclaracao setExp(Expressao e) { expressao = e; return this; }

  public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException {
        ambiente.incrementa();
        DeclaracaoFuncional decFuncional;
        while (seqdecFuncional !=null ) {
          decFuncional = seqdecFuncional.getDec();
          ambiente.mapValor(decFuncional.getID(), decFuncional.getValor(ambiente));
          seqdecFuncional = seqdecFuncional.next();
        }
        Valor vresult = expressao.avaliar(ambiente);
        ambiente.restaura();
        return vresult;
  }

  public ListaValorFuncao avaliarchamadodeaplicacao(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException {
    return new ListaValorFuncao((ValorFuncao)this.avaliar(ambiente));
  }

}