package plp.funcional2;
import plp.funcional2.memoria.*;

public class ExpHead extends ExpUnaria{

	public ExpHead(Expressao exp){
		this.setExpUnaria(exp, "head");
	}

	public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException,VariavelJaDeclaradaException {
		Expressao lista;
		Valor v, resposta;

		lista = this.getExp();

		if (lista instanceof ListaValorBooleano)
		{
			v = ((ListaValorBooleano)lista.avaliar(ambiente)).head();
			return new ValorBooleano (
						((ValorBooleano)v).valor());
		}
		else if (lista instanceof ListaValorInteiro)
		{
			v = ((ListaValorInteiro)lista.avaliar(ambiente)).head();
			return new ValorInteiro (
	                   ((ValorInteiro)v).valor());
		}
		else if (lista instanceof ListaValorString)
		{
			v = ((ListaValorString)lista.avaliar(ambiente)).head();
			return new ValorString (
						((ValorString)v).valor());
		}
		else	// ListaValorFuncao
		{
			v = ((ListaValorFuncao)lista.avaliar(ambiente)).head();
			return new ValorFuncao (
						((ValorFuncao)v).getListaId(), ((ValorFuncao)v).getExp());
		}
	}
}