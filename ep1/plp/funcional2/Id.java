package plp.funcional2;
import plp.funcional2.memoria.*;


public class Id implements Expressao{
  private String  idName;

  public Id(String strName) { idName =  strName; }

  public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException {
      return (Valor)ambiente.getValor(this);
  }

  public ListaValorFuncao avaliarchamadodeaplicacao(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException {
      return (ListaValorFuncao)ambiente.getValor(this);
  }

  public boolean equals(Object obj) {
      if (obj instanceof Id) {
	  return ((Id) obj).idName.equals(this.idName);
      }
      return false;
  }

  public int hashCode() {
      return idName.hashCode();
  }

}

