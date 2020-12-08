package plp.funcional2;

import plp.funcional2.memoria.*;

public class IfThenElse implements Expressao{
  Expressao teste;
  Expressao then;
  Expressao elseExpressao;

  public IfThenElse(Expressao teste,Expressao thenExpressao, Expressao elseExpressao){
    this.teste = teste;
    this.then =  thenExpressao;
    this.elseExpressao = elseExpressao;
  }

  public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException {
      if ( ((ValorBooleano)teste.avaliar(ambiente)).valor() ) return then.avaliar(ambiente);
      else return elseExpressao.avaliar(ambiente);
  }

  public ListaValorFuncao avaliarchamadodeaplicacao(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException {
    return new ListaValorFuncao((ValorFuncao)this.avaliar(ambiente));
  }

} 