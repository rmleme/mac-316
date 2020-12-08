package plp.funcional2;
import plp.funcional2.memoria.*;

public class ListaValorFuncao implements ListaValor {
	private ValorFuncao head;
	private ListaValorFuncao tail;

	public ListaValorFuncao() {
		head = null;
		tail = null;
	}

	public ListaValorFuncao(ValorFuncao v) {
		head = v;
		tail = null;
	}

	public ListaValorFuncao(ValorFuncao v, ListaValorFuncao l) {
		head = v;

		// Se a lista l for vazia ela eh ignorada
		if (l.head() == null) {
			tail = null;
		} else {
			tail = l;
		}
	}

	public Valor head() {
		return head;
	}

	public ListaValor tail() {
		return tail;
	}

	public void setTail(ListaValorFuncao t) {
		tail = t;
	}

	public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException { return this; }

	public ListaValorFuncao avaliarchamadodeaplicacao(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException {
	    return this;
	}

        /* Função que pega o ValorFuncao correspondente ao argumento arg. Se ele não estiver
	   em nenhuma lista de valores, usa-se o valorFuncao que contém uma ListaId. */
        public ValorFuncao getValorFuncao (Valor arg) {
	    ValorFuncao val, result = null;
	    ListaValorFuncao list = this;
	    while (list != null) {
		val = (ValorFuncao)list.head();
		if (val.getListaId() != null) {
		    result = val;
		} else {
		    ListaValor l = val.getValorArg();
		    Valor v;
		    while (l != null) {
			v = l.head();
			if (v.equals(arg)) return val;
			l = l.tail();
		    }
		}
		list = (ListaValorFuncao)list.tail();
	    }
	    return result;
	}

	public boolean equals(Valor obj) {
		ListaValorFuncao l1, l2;

		l1 = this;
		l2 = (ListaValorFuncao) obj;
	
		 while (l1 != null && l2 != null) {
			if (!(l1.head().equals(l2.head()))) {
				return false;
			}
			l1 = (ListaValorFuncao) l1.tail();
			l2 = (ListaValorFuncao) l2.tail();
		}

		if (l1 == null && l2 == null) {
			return true;
		} else {
			return false;
		}
	}

	public ListaValorFuncao append(ListaValorFuncao l2) {
		ListaValorFuncao antigo, novo, l1, l3;

		l1 = this;
		l3 = new ListaValorFuncao((ValorFuncao)l1.head());
		antigo = l3;
		l1 = (ListaValorFuncao)l1.tail();
		while (l1 != null) {
			novo = new ListaValorFuncao((ValorFuncao)l1.head());
			antigo.setTail(novo);
			antigo = novo;
			l1 = (ListaValorFuncao)l1.tail();
		}
		while (l2 != null && l2.head() != null) {      // l2.head() == null eh uma lista vazia
			novo = new ListaValorFuncao((ValorFuncao)l2.head());
			antigo.setTail(novo);
			antigo = novo;
			l2 = (ListaValorFuncao)l2.tail();
		}

		return l3;
	}
};
