import plp.funcional2.*;
import plp.funcional2.memoria.*;

public class Exemplos {
  public static void main(String [] args){

   /* let fun SomaParcial 0 = 0 | n = n + SomaParcial (n - 1)] in SomaParcial (4) */

   Id ids = new Id("s");
   Id idn = new Id("n");
   ValorFuncao vf1 = new ValorFuncao (new ListaValorInteiro (new ValorInteiro(0)), new ValorInteiro (0));
   ExpSub exp1 = new ExpSub (idn, new ValorInteiro(1));
   Aplicacao ap = new Aplicacao (ids, new ListaExpressao(exp1));
   ExpSoma exp2 = new ExpSoma (idn, ap);
   ValorFuncao vf2 = new ValorFuncao (new ListaId (idn), exp2);
   DecFuncao dec4 = new DecFuncao (ids, new ListaValorFuncao (vf1, new ListaValorFuncao (vf2)));
   Aplicacao ap2 = new Aplicacao (ids, new ListaExpressao (new ValorInteiro(4)));
   ExpDeclaracao e = new ExpDeclaracao (new SeqDec(dec4), ap2);
   Programa prg = new Programa(e);
   
   prg.executar();

 }

}
