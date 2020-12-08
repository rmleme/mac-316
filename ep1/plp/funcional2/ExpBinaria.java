package plp.funcional2;
import plp.funcional2.memoria.*;

public abstract class ExpBinaria implements Expressao{
  private Expressao esq, dir;
  private String operador;

  public void setExpBinaria( Expressao e, Expressao d, String o) {
    esq = e;
    dir = d;
    operador = o;
  }

  public Expressao getEsq( ) {
    return esq;
  }

  public Expressao getDir( ) {
    return dir;
  }

  public ListaValorFuncao avaliarchamadodeaplicacao(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException {
      return new ListaValorFuncao();
  }

}