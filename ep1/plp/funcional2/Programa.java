package plp.funcional2;

import plp.funcional2.memoria.*;

public class Programa {
  private Expressao exp;
  
  public Programa(Expressao expressaoArg) {exp=expressaoArg;}

  public void executar(){
      try{
          AmbienteExecucao ambiente = new ContextoExecucao();
          System.out.print("\nResultado da avaliação....");
          System.out.println(exp.avaliar(ambiente));
      }
      catch( VariavelNaoDeclaradaException idNaoDeclarado ){ idNaoDeclarado.printStackTrace(); }
      catch( VariavelJaDeclaradaException idJaDeclarado ){ idJaDeclarado.printStackTrace(); }
  }

} 