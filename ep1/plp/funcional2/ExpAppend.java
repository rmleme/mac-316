package plp.funcional2;
import plp.funcional2.memoria.*;

public class ExpAppend extends ExpBinaria{

	public ExpAppend(Expressao esq, Expressao dir) {
		this.setExpBinaria(esq, dir, "append");
	}

	public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException {
		Expressao l1, l2;

		l1 = this.getEsq();
		l2 = this.getDir();

		if (l1 instanceof ListaValorBooleano)
		{
			return ((ListaValorBooleano)l1).append((ListaValorBooleano)l2);
		}
		else if (l1 instanceof ListaValorInteiro)
		{
			return ((ListaValorInteiro)l1).append((ListaValorInteiro)l2);
		}
		else if (l1 instanceof ListaValorString)
		{
			return ((ListaValorString)l1).append((ListaValorString)l2);
		}
		else	// ListaValorFuncao
		{
			return ((ListaValorFuncao)l1).append((ListaValorFuncao)l2);
		}
	}
}
