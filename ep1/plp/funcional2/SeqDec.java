package plp.funcional2;

public class SeqDec {
/*Representa uma sequencia de declaracoesFuncionais*/
  private DeclaracaoFuncional dec;
  private SeqDec prox;
  public SeqDec(DeclaracaoFuncional d) {
      dec=d;
      prox=null;
  }
  public SeqDec(DeclaracaoFuncional d, SeqDec p) {
      dec=d;
      prox=p;
  }
  public DeclaracaoFuncional getDec() { return dec; }
  public SeqDec next() { return prox; }
  public boolean hasMoreElements() { return prox!=null; }
}