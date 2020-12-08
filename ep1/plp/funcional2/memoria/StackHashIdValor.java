package plp.funcional2.memoria;

import java.util.Stack;

/**
 * Pilha de elementos da classe HashIdExpressao.
 */
public class StackHashIdValor {

	/**
	 * A pilha de java para a qual serão delegadas as operações.
	 */
	private Stack pilha;
	
	/**
	 * Construtor da classe.
	 */
	public StackHashIdValor() {
		this.pilha = new Stack();
	}
	
	/**
	 * Insere um novo elemento nesta pilha.
	 *
	 * @param elemento o elemento a ser inserido.
	 */
	public void push(HashIdExpressao elemento) {
		pilha.push(elemento);
	}

	/**
	 * Remove o topo da pilha, retornando-o.
	 *
	 * @return o antigo topo da pilha.
	 */
	public HashIdExpressao pop() {
		return (HashIdExpressao) pilha.pop();
	}

	/**
	 * Retorna o topo da pilha, sem removê-lo.
	 *
	 * @return o topo da pilha.
	 */
	public HashIdExpressao peek() {
		return (HashIdExpressao) pilha.peek();
	}

	/**
	 * Verifica se esta pilha está vazia.
	 *
	 * @return <code>true</code> se estiver vazia; <code>false</code>
	 *          caso contrário.
	 */
	public boolean empty() {
		return pilha.empty();
	}

}
