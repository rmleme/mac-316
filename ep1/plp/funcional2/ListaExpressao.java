package plp.funcional2;

public class ListaExpressao {
  private Expressao exp;
  private ListaExpressao prox;
  public ListaExpressao(Expressao e) {
    exp=e;
    prox=null;
  }
  public ListaExpressao(Expressao e, ListaExpressao p) {
      exp=e;
      prox=p;
  }
  public Expressao getExp() { return exp; }
  public ListaExpressao next() { return prox;}
}