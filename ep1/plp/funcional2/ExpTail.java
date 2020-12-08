package plp.funcional2;
import plp.funcional2.memoria.*;

public class ExpTail extends ExpUnaria{

	public ExpTail(Expressao exp){
		this.setExpUnaria(exp, "tail");
	}

	public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException {
		return ((ListaValor)this.getExp().avaliar(ambiente)).tail();
	}
}