package plp.funcional2;
import plp.funcional2.memoria.*;

public class ListaValorString implements ListaValor {
	private ValorString head;
	private ListaValorString tail;

	public ListaValorString() {
		head = null;
		tail = null;
	}

	public ListaValorString(ValorString v) {
		head = v;
		tail = null;
	}

	public ListaValorString(ValorString v, ListaValorString l) {
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

	public void setTail(ListaValorString t) {
		tail = t;
	}

	public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException { return this; }

	public ListaValorFuncao avaliarchamadodeaplicacao(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException {
	    return new ListaValorFuncao();
	}

	public boolean equals(Valor obj) {
		ListaValorString l1, l2;

		l1 = this;
		l2 = (ListaValorString) obj;
	
		 while (l1 != null && l2 != null) {
			if (!(l1.head().equals(l2.head()))) {
				return false;
			}
			l1 = (ListaValorString) l1.tail();
			l2 = (ListaValorString) l2.tail();
		}

		if (l1 == null && l2 == null) {
			return true;
		} else {
			return false;
		}
	}

	public ListaValorString append(ListaValorString l2) {
		ListaValorString antigo, novo, l1, l3;

		l1 = this;
		l3 = new ListaValorString((ValorString)l1.head());
		antigo = l3;
		l1 = (ListaValorString)l1.tail();
		while (l1 != null) {
			novo = new ListaValorString((ValorString)l1.head());
			antigo.setTail(novo);
			antigo = novo;
			l1 = (ListaValorString)l1.tail();
		}
		while (l2 != null && l2.head() != null) {      // l2.head() == null eh uma lista vazia
			novo = new ListaValorString((ValorString)l2.head());
			antigo.setTail(novo);
			antigo = novo;
			l2 = (ListaValorString)l2.tail();
		}

		return l3;
	}
};
