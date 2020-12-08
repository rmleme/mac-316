package plp.funcional2;
import plp.funcional2.memoria.*;

public class ListaValorBooleano implements ListaValor {
	private ValorBooleano head;
	private ListaValorBooleano tail;

	public ListaValorBooleano() {
		head = null;
		tail = null;
	}

	public ListaValorBooleano(ValorBooleano v) {
		head = v;
		tail = null;
	}

	public ListaValorBooleano(ValorBooleano v, ListaValorBooleano l) {
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

	public void setTail(ListaValorBooleano t) {
		tail = t;
	}

	public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException { return this; }

	public ListaValorFuncao avaliarchamadodeaplicacao(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException {
	    return new ListaValorFuncao();
	}

	public boolean equals(Valor obj) {
		ListaValorBooleano l1, l2;

		l1 = this;
		l2 = (ListaValorBooleano) obj;
	
		 while (l1 != null && l2 != null) {
			if (!(l1.head().equals(l2.head()))) {
				return false;
			}
			l1 = (ListaValorBooleano) l1.tail();
			l2 = (ListaValorBooleano) l2.tail();
		}

		if (l1 == null && l2 == null) {
			return true;
		} else {
			return false;
		}
	}

	public ListaValorBooleano append(ListaValorBooleano l2) {
		ListaValorBooleano antigo, novo, l1, l3;

		l1 = this;
		l3 = new ListaValorBooleano((ValorBooleano)l1.head());
		antigo = l3;
		l1 = (ListaValorBooleano)l1.tail();
		while (l1 != null) {
			novo = new ListaValorBooleano((ValorBooleano)l1.head());
			antigo.setTail(novo);
			antigo = novo;
			l1 = (ListaValorBooleano)l1.tail();
		}
		while (l2 != null && l2.head() != null) {      // l2.head() == null eh uma lista vazia
			novo = new ListaValorBooleano((ValorBooleano)l2.head());
			antigo.setTail(novo);
			antigo = novo;
			l2 = (ListaValorBooleano)l2.tail();
		}

		return l3;
	}
};
