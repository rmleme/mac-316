package plp.funcional2;
import plp.funcional2.memoria.*;

public class ListaValorInteiro implements ListaValor {
	private ValorInteiro head;
	private ListaValorInteiro tail;

	public ListaValorInteiro() {
		head = null;
		tail = null;
	}

	public ListaValorInteiro(ValorInteiro v) {
		head = v;
		tail = null;
	}

	public ListaValorInteiro(ValorInteiro v, ListaValorInteiro l) {
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

	public void setTail(ListaValorInteiro t) {
		tail = t;
	}

	public Valor avaliar(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException { return this; }

	public ListaValorFuncao avaliarchamadodeaplicacao(AmbienteExecucao ambiente) throws VariavelNaoDeclaradaException {
	    return new ListaValorFuncao();
	}

	public boolean equals(Valor obj) {
		ListaValorInteiro l1, l2;

		l1 = this;
		l2 = (ListaValorInteiro) obj;
	
		 while (l1 != null && l2 != null) {
			if (!(l1.head().equals(l2.head()))) {
				return false;
			}
			l1 = (ListaValorInteiro) l1.tail();
			l2 = (ListaValorInteiro) l2.tail();
		}

		if (l1 == null && l2 == null) {
			return true;
		} else {
			return false;
		}
	}

	public ListaValorInteiro append(ListaValorInteiro l2) {
		ListaValorInteiro antigo, novo, l1, l3;

		l1 = this;
		l3 = new ListaValorInteiro((ValorInteiro)l1.head());
		antigo = l3;
		l1 = (ListaValorInteiro)l1.tail();
		while (l1 != null) {
			novo = new ListaValorInteiro((ValorInteiro)l1.head());
			antigo.setTail(novo);
			antigo = novo;
			l1 = (ListaValorInteiro)l1.tail();
		}
		while (l2 != null && l2.head() != null) {      // l2.head() == null eh uma lista vazia
			novo = new ListaValorInteiro((ValorInteiro)l2.head());
			antigo.setTail(novo);
			antigo = novo;
			l2 = (ListaValorInteiro)l2.tail();
		}

		return l3;
	}
};
