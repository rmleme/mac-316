package plp.funcional2;
import plp.funcional2.memoria.*;

public class ExpCons extends ExpBinaria{

	public ExpCons(Expressao esq, Expressao dir) {
		this.setExpBinaria(esq, dir, "cons");
	}

	// Valor cons Lista
	public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException {
		Expressao e, l1, l2;

		e = this.getEsq();
		l2 = this.getDir();

		if (l2 instanceof ListaValorBooleano)
		{
			l1 = new ListaValorBooleano ((ValorBooleano) e);
			return ((ListaValorBooleano)l1).append((ListaValorBooleano)l2);
		}
		else if (l2 instanceof ListaValorInteiro)
		{
			l1 = new ListaValorInteiro ((ValorInteiro) e);
			return ((ListaValorInteiro)l1).append((ListaValorInteiro)l2);
		}
		else if (l2 instanceof ListaValorString)
		{
			l1 = new ListaValorString ((ValorString) e);
			return ((ListaValorString)l1).append((ListaValorString)l2);
		}
		else	// ListaValorFuncao
		{
			l1 = new ListaValorFuncao ((ValorFuncao) e);
			return ((ListaValorFuncao)l1).append((ListaValorFuncao)l2);
		}
	}
}
