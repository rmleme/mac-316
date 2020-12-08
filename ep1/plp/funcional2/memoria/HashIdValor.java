package plp.funcional2.memoria;

import java.util.Enumeration;
import java.util.Hashtable;
import plp.funcional2.Id;
import plp.funcional2.Valor;

/**
 * Tabela hash cujas chaves são identificadores e os valores
 * são valores.
 */
public class HashIdValor {

	/**
	 * A tabela hash de java para a qual serão delegadas as operações.
	 */
	private Hashtable tabela;
	
	/**
	 * Construtor da classe.
	 */
	public HashIdValor() {
		this.tabela = new Hashtable();
	}
	
	/**
	 * Insere um novo par (id, valor) nesta tabela.
	 *
	 * @param id o id a ser mapeado no tipo.
	 * @param valor o valor mapeado no id.
	 * @return o valor previamente mapeado ao id, ou <code>null</code> se
	 *          não existia.
	 */
	public Valor put(Id id, Valor valor) {
		Object result = tabela.put(id, valor);
		if (result == null) {
			return null;
		} else {
			return (Valor) result;
		}
	}
	
	/**
	 * Retorna o valor associado ao id dado.
	 *
	 * @param id o id procurado
	 * @return o valor associado ao id dado.
	 */
	public Valor get(Id id) {
		Object result = tabela.get(id);
		if (result == null) {
			return null;
		} else {
			return (Valor) result;
		}
	}
	
	/**
	 * Retorna uma enumeracao com as chaves desta tabela.
	 *
	 * @return uma enumeracao com as chaves desta tabela.
	 */
	public Enumeration keys() {
		return tabela.keys();
	}

}
