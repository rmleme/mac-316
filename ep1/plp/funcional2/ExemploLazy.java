import plp.funcional2.*;
import plp.funcional2.memoria.*;

public class ExemploLazy {
  public static void main(String [] args){

   // let f(x) = x + x in f(2-1)

   Id idf = new Id("f");
   Id idx = new Id("x");

   Expressao exp = new ExpSoma(idx, idx);
   DecFuncao dec1 = new DecFuncao(idf, new ValorFuncao(new ListaId(idx), exp));
   Aplicacao ap = new Aplicacao (idf, new ListaExpressao (new ExpSub(new ValorInteiro(2), new ValorInteiro(1))));
   ExpDeclaracao expDeclara = new ExpDeclaracao(new SeqDec(dec1), ap);

   Programa prg = new Programa(expDeclara);
   prg.executar();
 }
}
